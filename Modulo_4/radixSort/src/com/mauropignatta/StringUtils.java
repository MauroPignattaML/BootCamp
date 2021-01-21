package com.mauropignatta;

import java.util.List;

public class StringUtils {

    List<String> toStringList(int[] arr) {
        return null;
    }

    int[] toIntArray(List<String> list) {
        return new int[0];
    }

    public static String fill(String src, char value, int length) {
        for (int i = src.length(); i < length; ++i){
            src += value;
        }
        return reverse(src);
    }

    public static String reverse(String src) {
        String reversed = "";
        for(int i = 0; i < src.length(); ++i) {
            reversed += src.charAt(src.length() - i - 1);
        }
        return reversed;
    }

}
