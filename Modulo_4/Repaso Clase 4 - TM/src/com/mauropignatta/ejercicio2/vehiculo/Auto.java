package com.mauropignatta.ejercicio2.vehiculo;

public class Auto extends Vehiculo{

    public static final int DEFAULT_PESO = 1000;
    public static final int DEFAULT_RUEDAS = 4;

    public Auto() {
        setPeso(DEFAULT_PESO);
        setRuedas(DEFAULT_RUEDAS);
    }
}
