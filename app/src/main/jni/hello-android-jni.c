#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_jni_hello_1jni_MainActivity_getMsgFromJni(JNIEnv *env, jobject instance) {

// TODO

    return (*env)->
            NewStringUTF(env, "Hello From Jni");
}