package com.mauropignatta.sorter;

import java.util.Comparator;

public interface Sorter<T> {

    void sort(T[] arr, Comparator<T> comparator);

}
