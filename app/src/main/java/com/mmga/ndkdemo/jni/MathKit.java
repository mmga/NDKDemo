package com.mmga.ndkdemo.jni;

/**
 * Created by mmga on 2015/11/18.
 */
public class MathKit {

    public static native int square(int num);

    static {
        System.loadLibrary("JniDemo");
    }


}
