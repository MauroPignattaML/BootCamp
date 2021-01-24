package com.mauropignatta;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static String rpad(String src, char fillValue, int len){
        StringBuilder builder = new StringBuilder(src);
        for (int i = src.length(); i < len; ++i ){
            builder.append(fillValue);
        }
        return builder.toString();
    }

    public static String ltrim(String src){
        StringBuilder builder = new StringBuilder(src);
        int lastPos;
        for(lastPos = 0; lastPos < src.length(); ++lastPos){
            if(src.charAt(lastPos) != ' '){
                break;
            }
        }
        builder.replace(0, lastPos, "");
        return builder.toString();
    }

    public static String rtrim(String src){
        src = reverse(src);
        src = ltrim(src);
        return reverse(src);
    }

    public static String trim(String src){
        return ltrim(rtrim(src));
    }


    public static int indexOfN(String src, char ch, int n){
        if(n <= 0) return -1;

        int pos = -1;
        while(n - 1 > 0){
            pos = src.indexOf(ch, pos + 1);
            n--;
        }
        return src.indexOf(ch, pos + 1);
    }

    private static String reverse(String src) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < src.length(); ++i){
            builder.append(src.charAt(src.length() - 1 -i));
        }
        return builder.toString();
    }

}
