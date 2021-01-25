package com.mauropignatta.sorter;

import java.util.Comparator;

public class BubbleSortSorterImpl<T> implements Sorter<T> {

    @Override
    public void sort(T[] arr, Comparator<T> comparator) {
        for(int i = 0; i < arr.length - 1; ++i){
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if(comparator.compare(arr[j], arr[j + 1]) > 0){
                    T aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }
}
