#include <jni.h>

//JNIEXPORT int JNICALL Java_com_github_sammyne_helloworld_HelloWorld_addV(JNIEnv *env,
//  jobject obj, int x) {
//  return x+1;
//}

JNIEXPORT int JNICALL Java_com_github_sammyne_helloworld_HelloWorld_increment(JNIEnv *env,
  jobject obj, int x) {
  return x+1;
}
