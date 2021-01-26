package com.mauropignatta.ejercicio2.socorrista;

import com.mauropignatta.ejercicio2.vehiculo.Auto;
import com.mauropignatta.ejercicio2.vehiculo.Vehiculo;

public class SocorristaAuto implements Socorrista{

    @Override
    public void socorrer(Vehiculo v) {
        if(v instanceof Auto)
            System.out.println("Socorriendo Auto: " + v.getPatente());
        else
            System.out.println("No es un Auto");
    }
}
