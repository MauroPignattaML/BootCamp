package com.mauropignatta.ejercicio2.carrera;

import com.mauropignatta.ejercicio2.vehiculo.Auto;
import com.mauropignatta.ejercicio2.vehiculo.Moto;
import com.mauropignatta.ejercicio2.vehiculo.Vehiculo;
import com.mauropignatta.ejercicio2.socorrista.Socorrista;
import com.mauropignatta.ejercicio2.socorrista.SocorristaAuto;
import com.mauropignatta.ejercicio2.socorrista.SocorristaMoto;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    private Socorrista socorristaAuto;
    private Socorrista socorristaMoto;

    private List<Vehiculo> vehiculos;
    private int cantVehiculos;
    private String nombre;
    private int distancia;
    private int premio;

    public Carrera(int cantVehiculos, String nombre, int distancia, int premio) {
        this.cantVehiculos = cantVehiculos;
        this.nombre = nombre;
        this.distancia = distancia;
        this.premio = premio;
        this.vehiculos = new ArrayList<>();
        this.socorristaAuto = new SocorristaAuto();
        this.socorristaMoto = new SocorristaMoto();
    }

    public void darDeAltaMoto(int vel, int ac, int ang, String patente) {
        if (!quedanCupos()) return;

        Vehiculo moto = new Moto();
        darAlta(moto, vel, ac, ang, patente);
    }

    public void darDeAltaAuto(int vel, int ac, int ang, String patente) {
        if (!quedanCupos()) return;

        Vehiculo auto = new Auto();
        darAlta(auto, vel, ac, ang, patente);
    }

    private void darAlta(Vehiculo v, int vel, int ac, int ang, String patente) {
        v.setVelocidad(vel);
        v.setAceleracion(ac);
        v.setAnguloGiro(ang);
        v.setPatente(patente);

        vehiculos.add(v);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public void eliminarVehiculo(String patente) {
        Vehiculo vehiculo = getVehiculo(patente);
        eliminarVehiculo(vehiculo);
    }

    public Vehiculo getVehiculo(String patente){
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equals(patente)) {
                return v;
            }
        }
        return null;
    }

    public Vehiculo obtenerGanador() {
        Vehiculo ganador = null;
        double maxPuntaje = 0;
        double puntajeActual = 0;
        for (Vehiculo v : vehiculos) {
            puntajeActual = formulaGanador(v);
            if (puntajeActual > maxPuntaje) {
                maxPuntaje = puntajeActual;
                ganador = v;
            }
        }
        return ganador;
    }

    private double formulaGanador(Vehiculo v) {
        double f1 = v.getVelocidad() * v.getAceleracion() / 2;
        double f2 = v.getAnguloGiro() * (v.getPeso() - v.getRuedas() * 100);
        return f1 / f2;
    }

    private boolean quedanCupos() {
        return vehiculos.size() < cantVehiculos;
    }

    public void socorrerAuto(String patente) {
        Vehiculo v = getVehiculo(patente);
        if(v != null)
            socorristaAuto.socorrer(v);
        else
            System.out.println("No existe Auto con patente: " + patente);
    }

    public void socorrerMoto(String patente) {
        Vehiculo v = getVehiculo(patente);
        if(v != null)
            socorristaMoto.socorrer(v);
        else
            System.out.println("No existe Moto con patente: " + patente);
    }

    // Setters & getters

    public int getCantVehiculos() {
        return cantVehiculos;
    }

    public void setCantVehiculos(int cantVehiculos) {
        this.cantVehiculos = cantVehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }
}
