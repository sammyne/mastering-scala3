#include "HelloWorld.h"

#include <stdio.h>

JNIEXPORT void JNICALL Java_HelloWorld_hi(JNIEnv *env, jobject o) {
  printf("Hi\n");
}
