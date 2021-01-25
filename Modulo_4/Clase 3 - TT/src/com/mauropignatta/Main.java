package com.mauropignatta;

import com.mauropignatta.factory.SorterFactory;
import com.mauropignatta.sorter.BubbleSortSorterImpl;
import com.mauropignatta.sorter.HeapSortSorterImpl;
import com.mauropignatta.sorter.QuickSortSorterImpl;
import com.mauropignatta.sorter.Sorter;
import com.mauropignatta.timer.Timer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {
        Comparator<String> comparator = (a, b) -> a.compareTo(b); // Ascendente
        String[] arr = { "Lulu", "Lele", "Lili", "Lala", "Lolo"};
        Sorter<String> sorter = null;

//        System.out.println("Antes:\t\t" + Arrays.toString(arr));
//
//        Properties properties = new Properties();
//        properties.load(new FileInputStream("MyFactory.props"));
//        String sorterClass = properties.getProperty("sorter");
//        sorter = (Sorter<String>) SorterFactory.getInstance(sorterClass);
//        sorter.sort(arr, comparator);
//
//        System.out.println("Despues:\t" + Arrays.toString(arr));
//        System.out.println("Algoritmo:\t" + sorter.getClass().getSimpleName());

        // Pruebas de rendimiento

        Comparator<Integer> integerComparator = Comparator.naturalOrder();
        Timer timer = new Timer();
        Sorter<Integer> sorterInt = new QuickSortSorterImpl<>();
        int n = 10000;
        Integer[] values = new Integer[n];

        for(int i = 0; i < n; ++i) {
            values[i] = n - 1 - i;
        }

        timer.start();
        sorterInt.sort(values, integerComparator);
        timer.stop();

        System.out.println("Tiempo: " + timer.elapsedTime() + "ms");

    }
}
