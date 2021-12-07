package com.example.sesionCuatro.clases;

public class SmartWatch extends SmartDevice {

    public String correa;
    public boolean sim;
    public int memoria;


    public SmartWatch() {
    }

    public SmartWatch(double peso, String modelo, String color, double precio, String correa, boolean sim, int memoria) {
        super(peso, modelo, color, precio);
        this.correa = correa;
        this.sim = sim;
        this.memoria = memoria;
    }


}
