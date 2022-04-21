use std::panic;

// This is the interface to the JVM that we'll call the majority of our
// methods on.
use jni::JNIEnv;
// These objects are what you should use as arguments to your native
// function. They carry extra lifetime information to prevent them escaping
// this context and getting used after being GC'd.
use jni::objects::JObject;
use jni::sys::jint;

#[no_mangle]
pub extern "system" fn Java_com_github_sammyne_helloworld_HelloWorld_addV(
    env: JNIEnv,
    obj: JObject,
    x: jint,
) -> jint {
    let result = panic::catch_unwind(|| {
        let v = env.get_field(obj, "v", "I").unwrap().i().unwrap();
        x + v
    });
    result.unwrap_or_else(|e| {
        let description = e
            .downcast_ref::<String>()
            .map(|e| &**e)
            .or_else(|| e.downcast_ref::<&'static str>().copied())
            .unwrap_or("Unknown error in native code.");
        // don't `unwrap` `throw_new`, another JVM exception might have already been thrown, in which case the `Result` is `Err`
        let _ = env.throw_new("java/lang/RuntimeException", description);
        -1 // some value to satisfy type checker, it won't be used
    })
}

// This keeps Rust from "mangling" the name and making it unique for this crate.
#[no_mangle]
pub extern "system" fn Java_com_github_sammyne_helloworld_HelloWorld_increment(
    _env: JNIEnv,
    _obj: JObject,
    x: jint,
) -> jint {
    x + 1
}
