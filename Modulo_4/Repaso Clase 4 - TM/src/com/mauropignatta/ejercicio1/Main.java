package com.mauropignatta.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Prenda> prendas = new ArrayList<>();
        prendas.add(new Prenda("aaa", "aaa"));
        prendas.add(new Prenda("bbb", "bbb"));

        GuardaRopa guardaRopa = new GuardaRopa();
        int id = guardaRopa.guardarPrendas(prendas);

        guardaRopa.mostrarPrendas();
        guardaRopa.devolverPrendas(id);
        guardaRopa.mostrarPrendas();

    }
}
