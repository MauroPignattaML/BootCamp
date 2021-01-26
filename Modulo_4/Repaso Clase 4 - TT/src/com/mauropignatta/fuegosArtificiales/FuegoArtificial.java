package com.mauropignatta.fuegosArtificiales;

import java.util.Random;

public class FuegoArtificial {

    private String[] ruido = {"PIM", "PUM", "PAM"};

    public void explotar(){
        Random r = new Random();
        System.out.println(ruido[r.nextInt(ruido.length)]);
    }
}
