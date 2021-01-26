package com.mauropignatta.ejercicio2;

import com.mauropignatta.ejercicio2.carrera.Carrera;
import com.mauropignatta.ejercicio2.vehiculo.Vehiculo;

public class Main {

    public static void main(String[] args) {
        Carrera carrera = new Carrera(8, "Carrera", 1000, 10000);
        carrera.darDeAltaAuto(1000, 1000, 50, "ABC123");
        carrera.darDeAltaAuto(1, 1, 1, "dsa");
        carrera.darDeAltaAuto(2, 1, 1, "asd");
        carrera.darDeAltaAuto(2, 1, 1, "sda");

        Vehiculo v = carrera.obtenerGanador();
        System.out.println(v.getPatente());

        carrera.socorrerAuto("dada");
        carrera.socorrerAuto("ABC123");
        carrera.socorrerMoto("ABC123");
    }

}
