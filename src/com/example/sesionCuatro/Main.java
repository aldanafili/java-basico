package com.example.sesionCuatro;

/*Ejercicio Sesión 4
Ejercicio 1
En este ejercicio tendréis que crear una clase SmartDevice.
Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis
para imprimir sus valores por consola.*/

import com.example.sesionCuatro.clases.SmartDevice;
import com.example.sesionCuatro.clases.SmartPhone;
import com.example.sesionCuatro.clases.SmartWatch;

public class Main {

    public static void main(String[] args) {

        //Paso por parametros las caracteristicas de un reloj

        SmartWatch reloj = new SmartWatch(0.250, "xiaomi","negro", 200,"plastico", true,64);
        System.out.println(reloj);
       /* System.out.println("color " + reloj.color);
        System.out.println("modelo " + reloj.modelo);
        System.out.println("precio " + reloj.precio);
        System.out.println("memoria " + reloj.memoria);*/

        reloj.cambiarColor("gris");
        System.out.println("cambiar color a: " + reloj.color);

        //Paso por parametros las caracteristicas de un celular
        SmartPhone celular = new SmartPhone(0.550, "iphone 11", "plateado", 890, "ios", 128, "movistar");
        System.out.println(celular);
       /* System.out.println("color " + celular.color);
        System.out.println("modelo " + celular.modelo);
        System.out.println("compania " + celular.compania);*/

        celular.empresa("claro");
        System.out.println("La empresa cambio a: " + celular.compania);

    }


}
