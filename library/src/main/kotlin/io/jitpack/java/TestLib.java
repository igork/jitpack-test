package io.jitpack.java;

public class TestLib {

    public static String test(String str){

        if (str!=null){
            str += "--testlib test--";
        } else {
            str = "--testlib test--";
        }
        return str;
    }

}
