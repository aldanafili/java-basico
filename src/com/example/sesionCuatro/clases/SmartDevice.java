package com.example.sesionCuatro.clases;

public class SmartDevice {

    public double peso;
    public String modelo;
    public String color;
    public double precio;


    public SmartDevice() {
    }

    public SmartDevice(double peso, String modelo, String color, double precio) {
        this.peso = peso;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "peso=" + peso +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void cambiarColor(String colorNuevo){
        this.color = colorNuevo;
    }
}
