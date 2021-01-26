package com.mauropignatta.ejercicio2.socorrista;

import com.mauropignatta.ejercicio2.vehiculo.Moto;
import com.mauropignatta.ejercicio2.vehiculo.Vehiculo;

public class SocorristaMoto implements Socorrista {

    @Override
    public void socorrer(Vehiculo v) {
        if(v instanceof Moto)
            System.out.println("Socorriendo Moto: " + v.getPatente());
        else
            System.out.println("No es una Moto");
    }
}
