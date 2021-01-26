package model;

import interfacePrecedeable.Precedable;

public class Celular implements Precedable<Celular> {

    private Integer numero;
    private String titular;

    public Celular(Integer numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public int precedeA(Celular celular) {

        return this.getTitular().compareTo(celular.getTitular());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                '}';
    }
}
