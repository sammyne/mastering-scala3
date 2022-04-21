# call-cmake

Example calling library written by Rust.

## Environment
- sammyne/scala:2.12.15-jdk8-ubuntu20.04

## Quickstart

```bash
sbt core/run
```

Failed with logs as 

```bash
[info] welcome to sbt 1.6.2 (Private Build Java 1.8.0_312)
[info] loading settings for project sbt-jni-cmake-quickstart-build from plugins.sbt ...
[info] loading project definition from /github.com/sammyne/mastering-scala3/sbt-jni-cmake-quickstart/project
[info] loading settings for project root from build.sbt ...
[info] loading settings for project core from build.sbt ...
[info] set current project to sbt-jni-rs-quickstart (in build file:/github.com/sammyne/mastering-scala3/sbt-jni-cmake-quickstart/)
[info] Building library with native build tool CMake
[info] Using CMake version 3.16.3
[info] -- Configuring done
[info] -- Generating done
[info] -- Build files have been written to: /github.com/sammyne/mastering-scala3/sbt-jni-cmake-quickstart/native/target/native/x86_64-linux/build
[info] [100%] Built target helloworld
[info] -- Install configuration: "Release"
[error] java.lang.RuntimeException: No files were created during compilation, something went wrong with the CMake configuration.
[error]         at scala.sys.package$.error(package.scala:30)
[error]         at com.github.sbt.jni.build.ConfigureMakeInstall$Instance.library(ConfigureMakeInstall.scala:44)
[error]         at com.github.sbt.jni.build.ConfigureMakeInstall$Instance.library$(ConfigureMakeInstall.scala:26)
[error]         at com.github.sbt.jni.build.CMake$$anon$1.library(CMake.scala:17)
[error]         at com.github.sbt.jni.plugins.JniNative$.$anonfun$settings$14(JniNative.scala:115)
[error]         at scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error]         at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error]         at sbt.std.Transform$$anon$4.work(Transform.scala:68)
[error]         at sbt.Execute.$anonfun$submit$2(Execute.scala:282)
[error]         at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:23)
[error]         at sbt.Execute.work(Execute.scala:291)
[error]         at sbt.Execute.$anonfun$submit$1(Execute.scala:282)
[error]         at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
[error]         at sbt.CompletionService$$anon$2.call(CompletionService.scala:64)
[error]         at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error]         at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error]         at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error]         at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error]         at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error]         at java.lang.Thread.run(Thread.java:748)
[error] (native / nativeCompile) No files were created during compilation, something went wrong with the CMake configuration.
[error] Total time: 1 s, completed Apr 21, 2022 12:36:09 PM
```

## Reference
- [Scala and Rust interoperability via JNI](https://engineering.avast.io/scala-and-rust-interoperability-via-jni/)
