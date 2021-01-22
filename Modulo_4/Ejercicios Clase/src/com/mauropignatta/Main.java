package com.mauropignatta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

//	    // Punto 1
//        System.out.println("----- Punto 1 -----");
//        System.out.print("Ingrese un numero: ");
//        mostrarPrimerosPares(sc.nextInt());
//        System.out.println();
//
//        // Punto 2
//        System.out.println("----- Punto 2 -----");
//        System.out.print("Ingrese un numero: ");
//        int numero = sc.nextInt();
//        System.out.print("Ingrese cantidad de multiplos que desea: ");
//        int multiplos = sc.nextInt();
//        mostrarPrimerosMultiplos(numero, multiplos);
//        System.out.println();
//
//        // Punto 3
//        System.out.println("----- Punto 3 -----");
//        System.out.print("Ingrese un numero: ");
//        if(esPrimo(sc.nextInt())){
//            System.out.println("El numero ingresado es primo.");
//        } else {
//            System.out.println("El numero ingresado NO es primo.");
//        }
//        System.out.println();
//
//        // Punto 4
//        System.out.println("----- Punto 4 -----");
//        System.out.print("Ingrese la cantidad de numeros primos que desea obtener: ");
//        mostrarPrimos(sc.nextInt());
//
//        // Punto 5
        System.out.println("----- Punto 5 -----");
        System.out.print("Ingrese la cantidad de numeros naturales que desea obtener: ");
        int cantidad = sc.nextInt();
        System.out.print("Ingrese la cantidad de digitos: ");
        int cantDigitos = sc.nextInt();
        System.out.print("Ingrese el digito: ");
        int digito = sc.nextInt();
        mostrarNumerosNaturares(cantidad, cantDigitos, digito);

    }

    private static void mostrarNumerosNaturares(int cantidad, int cantDigitos, int digito) {
        int numActual = 0;
        while(cantidad > 0){
            if(contieneDigitos(numActual, cantDigitos, digito)){
                System.out.print(numActual + " ");
                cantidad--;
            }
            numActual++;
        }
    }

    private static boolean contieneDigitos(int num, int cantDigitos, int digito) {
        String strNum = Integer.toString(num);
        int len = strNum.length();
        strNum = strNum.replaceAll("" + digito, "");
        return len - strNum.length() >= cantDigitos;
    }

    private static void mostrarPrimos(int cantPrimos) {
        int numActual = 2;
        while(cantPrimos > 0){
            if(esPrimo(numActual)){
                System.out.print(numActual + " ");
                --cantPrimos;
            }
            ++numActual;
        }
    }

    public static void mostrarPrimerosPares(int num){
        for(int i = 0; i < num; ++i){
            System.out.print(i * 2 + " ");
        }
    }

    public static void mostrarPrimerosMultiplos(int num, int cantidadMultiplos){
        int i = 0;
        int numActual = 1;
        while(i < cantidadMultiplos){
            boolean esMultiplo = numActual % num == 0;
            if( esMultiplo ) {
                System.out.println(numActual + " ");
                ++i;
            }
            numActual++;
        }
    }

    public static boolean esPrimo(int num) {
        for(int i = 2; i <= num / 2; ++i){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
