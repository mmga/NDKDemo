package com.mmga.ndkdemo.jni;

/**
 * Created by mmga on 2015/11/18.
 */
public class StringKit {

    public static native void setNull(String str);

    static {
        System.loadLibrary("JniDemo");
    }
}
