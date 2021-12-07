package com.example.sesionTres;
/*En este ejercicio tenéis que crear un bucle que permita concatenar
textos e imprima el resultado final por consola.
Tened en cuenta que los textos pueden venir de un array de tipo String.
Por ejemplo: String[] nombres = {"", "", "", ""}*/

public class SesionTres {

    public static void main(String[] args) {

        String[] shakespear = {"Romeo Y Julieta","Hamlet","La Tempestad", "El Rey Lear"};
        String concatenarLibros = " ";
        //bucle for
        for(int i = 0; i < shakespear.length; i++){

            concatenarLibros = concatenarLibros + " " + shakespear[i];

        }
        System.out.println(concatenarLibros);

        //bucle foreach

        /*for(String libros: shakespear){
            System.out.println(libros);
        }*/

    }
}
