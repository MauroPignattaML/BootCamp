package com.mauropignatta;

public class CuentaCorriente {

    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public CuentaCorriente(){

    }

    public CuentaCorriente(double saldo){
        setSaldo(saldo);
    }

    public CuentaCorriente(CuentaCorriente cuenta){
        setSaldo(cuenta.getSaldo());
    }

    public void ingreso(double cantIngreso){
         double saldoTotal = saldo + cantIngreso;
         setSaldo(saldoTotal);
    }

    public void egreso(double cantEgreso){
        if(saldo < cantEgreso){
            throw new RuntimeException("Saldo insuficiente");
        }else{
            double saldoTotal = saldo - cantEgreso;
            setSaldo(saldoTotal);
        }
    }

    public static void transferencia(double cantTransferir, CuentaCorriente cuenta, CuentaCorriente ingresante){
        ingresante.ingreso(cantTransferir);
        cuenta.egreso(cantTransferir);
    }

    public void reintegro(double cantTransferir, CuentaCorriente cuenta){
        ingreso(cantTransferir);
        cuenta.egreso(cantTransferir);
    }
}
