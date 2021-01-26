package com.mauropignatta.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private Map<Integer, List<Prenda>> prendas;
    private int counter;

    public GuardaRopa() {
        prendas = new HashMap<>();
    }

    public Integer guardarPrendas(List<Prenda> prendas) {
        int id = counter;
        this.prendas.put(counter, prendas);
        counter++;
        return id;
    }

    public List<Prenda> devolverPrendas(int id) {
        List<Prenda> list = prendas.getOrDefault(id, new ArrayList<>());
        prendas.remove(id);
        return list;
    }

    public void mostrarPrendas() {
        prendas.forEach((k, v) -> System.out.print(k + ":" + v));
    }
}
