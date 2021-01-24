package com.mauropignatta;

import com.mauropignatta.figuras.Circulo;
import com.mauropignatta.figuras.FiguraGeometrica;
import com.mauropignatta.figuras.Rectangulo;
import com.mauropignatta.figuras.Triangulo;
import com.mauropignatta.password.Password;
import com.mauropignatta.password.PasswordFuerte;
import com.mauropignatta.password.PasswordIntermedia;
import com.mauropignatta.password.PasswordSimple;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Password simple = new PasswordSimple();
        Password intermedia = new PasswordIntermedia();
        Password fuerte = new PasswordFuerte();

        String password = "Aa123456!";

        try {
            simple.setValue(password); // Cumple la regex.
            intermedia.setValue(password); // Cumple la regex.
            fuerte.setValue(password); // NO Cumple la regex.
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10, 5));
        figuras.add(new Triangulo(10, 5));
        figuras.add(new Circulo(5));

        for(FiguraGeometrica figura : figuras) {
            System.out.println(figura);
        }

        System.out.println("El promedio es: " + FiguraGeometrica.areaPromedio(figuras));
    }
}
