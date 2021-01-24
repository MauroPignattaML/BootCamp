package com.mauropignatta;

public class Main {
    public static void main(String[] args) {
//        CuentaCorriente usuarioDos = new CuentaCorriente();
//        CuentaCorriente usuarioUno = new CuentaCorriente(600);
//        CuentaCorriente.transferencia(500, usuarioUno, usuarioDos);
//        System.out.println(usuarioUno.getSaldo());
//        System.out.println(usuarioDos.getSaldo());

//        Contador contar = new Contador(2);
//        contar.decremento();
//        System.out.println(contar.getContador());

//        Libro ejemplar = new Libro("Java a Fondo", "Pablo", 123L);
//        System.out.println(ejemplar);

//        Fecha fecha = new Fecha(2020,10,10);
//        System.out.println(fecha);

        System.out.println(StringUtils.rpad("Hola", 'a', 15));
        System.out.println(StringUtils.ltrim("     Hola"));
        System.out.println(StringUtils.rtrim("Chau     "));
        System.out.println(StringUtils.trim("     Chau     "));
        System.out.println(StringUtils.indexOfN("John|Paul|George|Ringo", '|', 2));
    }
}
