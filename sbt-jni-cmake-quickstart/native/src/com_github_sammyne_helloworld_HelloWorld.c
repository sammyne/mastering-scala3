#include <jni.h>

JNIEXPORT int JNICALL Java_com_github_sammyne_helloworld_HelloWorld_increment(JNIEnv *env,
  jobject obj, jint x) {
  return x + 1;
}
