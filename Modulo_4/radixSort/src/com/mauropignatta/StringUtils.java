package com.mauropignatta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StringUtils {

    public static List<String> toStringList(int[] arr) {
        List<String> list = new ArrayList<>();
        for (int n : arr){
            list.add(Integer.toString(n));
        }
        return list;
    }

    public static List<String> toStringList(Map<Integer, List<String>> map) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()){
            list.addAll(entry.getValue());
        }
        return list;
    }

    public static String fill(String src, char fillValue, int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = src.length(); i < length; ++i){
            builder.append(fillValue);
        }
        builder.append(src);
        return builder.toString();
    }

}
