package com.example.sesionCinco;

public class Coche{

    public String modelo;
    public String color;
    public int cantPuertas;
    public double precio;

    public Coche() {
    }

    public Coche(String modelo, String color, int cantPuertas, double precio) {
        this.modelo = modelo;
        this.color = color;
        this.cantPuertas = cantPuertas;
        this.precio = precio;
    }

    /*public void aceleracion (int velocidad){

         aceleracion += velocidad;

    }*/

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cantPuertas=" + cantPuertas +
                ", precio=" + precio +
                '}';
    }
}
