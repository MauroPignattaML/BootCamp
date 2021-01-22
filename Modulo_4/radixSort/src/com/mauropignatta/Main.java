package com.mauropignatta;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int arr[] = {123, 1, 2, 43, 2, 3942};
        System.out.println("Initial array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Ordered array: " + Arrays.toString(arr));
    }

    private static void radixSort(int[] arr) {
        int len = maxLength(arr);
        List<String> arrList = StringUtils.toStringList(arr);

        for(int i = 0; i < len; ++i){
            List<String> stringsNumList = initList(arrList, len);
            Map<Integer, List<String>> map = initMap();
            int index = len - 1 - i;

            for(String num : stringsNumList){
                int digit = Character.getNumericValue(num.charAt(index));
                map.get(digit).add(num);
            }

            arrList = StringUtils.toStringList(map);
        }

        for(int i = 0; i < arrList.size(); ++i){
            arr[i] = Integer.parseInt(arrList.get(i));
        }
    }

    public static int maxLength(int[] arr){
        int max = -1;
        for(int num : arr){
            max = Math.max(max, Integer.toString(num).length());
        }
        return max;
    }

    public static Map<Integer, List<String>> initMap(){
        Map<Integer, List<String>> map = new HashMap<>();
        for(int i = 0; i < 10; ++ i){
            map.put(i, new ArrayList<>());
        }
        return map;
    }

    public static List<String> initList(List<String> arrList, int len){
        List<String> list = new ArrayList<>();
        for (String s : arrList) {
            list.add(StringUtils.fill(s, '0', len));
        }
        return list;
    }
}
