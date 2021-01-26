package com.mauropignatta.ejercicio2.vehiculo;

public class Vehiculo {

    private int velocidad;
    private float aceleracion;
    private int anguloGiro;
    private String patente;
    private int peso;
    private int ruedas;

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getAnguloGiro() {
        return anguloGiro;
    }

    public void setAnguloGiro(int anguloGiro) {
        this.anguloGiro = anguloGiro;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
