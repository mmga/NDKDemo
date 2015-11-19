//
// Created by mmga on 2015/11/19.
//

#include <com_mmga_ndkdemo_jni_MathKit.h>

JNIEXPORT jint JNICALL Java_com_mmga_ndkdemo_jni_MathKit_square
        (JNIEnv *env,jclass cls, jint num) {
    return num * num;
}