package main;

import model.Celular;
import model.Persona;
import utils.SortUtil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Persona []p = {new Persona("Pepe", 3), new Persona("Tito", 1), new Persona("Micho", 6)};

        SortUtil.ordenar(p);

        System.out.println(Arrays.toString(p));

        Celular[] c = {new Celular(123, "Pepe"), new Celular(111, "Tito"), new Celular(333, "Micho")};

        SortUtil.ordenar(c);
        System.out.println(Arrays.toString(c));

    }
}
