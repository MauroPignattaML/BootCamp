package com.mauropignatta.figuras;

import java.util.List;

public abstract class FiguraGeometrica {

    public abstract double area();

    public static double areaPromedio(List<FiguraGeometrica> figuras){
        if(figuras == null || figuras.size() == 0) return 0;

        double suma = 0;
        for(FiguraGeometrica figura : figuras){
            suma += figura.area();
        }
        return suma / figuras.size();
    }

    @Override
    public String toString() {
        return "Soy un " + getClass().getSimpleName() + " y mi area es " + area();
    }
}
