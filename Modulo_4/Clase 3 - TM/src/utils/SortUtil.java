package utils;

import interfacePrecedeable.Precedable;

public class SortUtil {


    public static void ordenar(Precedable arr[]){

        Precedable aux = null;

        for(int i = 0; i < arr.length-1; ++i){
            for(int j = 0; j < arr.length-i-1; ++j){
                if(arr[j].precedeA(arr[j+1]) > 0){

                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
}
