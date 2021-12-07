package com.example.sesionDos;
/*Para este ejercicio tendréis que crear una función que reciba
 un precio y devuelva el precio con el IVA incluido.*/

public class SesionDos {

    public static void main(String[] args) {

        double total = precioIva(102.50);
        System.out.println(total);
    }

    static double precioIva(double precio) {
        double mult =  precio * 21 ;
        double div = mult / 100;
        return div + precio;
    }
}
