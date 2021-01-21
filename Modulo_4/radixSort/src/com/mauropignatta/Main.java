package com.mauropignatta;

public class Main {

    public static void main(String[] args) {
        int arr[] = {123, 1, 2, 43, 2};


    }

    public static int maxLength(int[] arr){
        int max = -1;
        for(int num : arr){
            max = Math.max(max, Integer.toString(num).length());
        }
        return max;
    }
}
