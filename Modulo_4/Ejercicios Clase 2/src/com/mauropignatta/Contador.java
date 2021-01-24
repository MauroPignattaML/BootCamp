package com.mauropignatta;

public class Contador {
    private int contador;

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public Contador() {

    }

    public Contador(int contador){
        setContador(contador);
    }

    public Contador(Contador m){
        setContador(m.getContador());
    }

    public void incremento(){
         contador++;
    }

    public void decremento(){
        contador--;
    }
}
