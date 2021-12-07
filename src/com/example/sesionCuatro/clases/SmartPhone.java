package com.example.sesionCuatro.clases;

public class SmartPhone extends SmartDevice{

    public String procesador;;
    public int memoria;
    public String compania;

    public SmartPhone() {
    }


   public SmartPhone(double peso, String modelo, String color, double precio, String procesador, int memoria, String compania) {
        super(peso, modelo, color, precio);
        this.procesador = procesador;
        this.memoria = memoria;
        this.compania = compania;
    }


    public void empresa (String compania){
        this.compania = compania;
    }


}
