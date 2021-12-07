package com.example.sesionCinco;

/*Ejercicio Sesión 5
Ejercicio 2
Crear una interfaz CocheCRUD.
Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
Como métodos de CocheCRUD podemos poner:
save()
findAll()
delete() que simplemente impriman por consola el nombre del propio método.
Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
Ejemplo: CocheCRUD cocheCrud = new CocheCRUDImpl()*/

public class Main {

        static CocheCRUD cocheCRUD =  new CocheCRUDImpl();

        public static void main(String[] args) {

        Coche audi = new Coche("audi","blanco", 4, 10.500);
        Coche BMW = new Coche("BMW","Plateado", 5, 12.800);
        System.out.println(audi);
        System.out.println(BMW);

        cocheCRUD.save(audi);
        cocheCRUD.save(BMW);
        cocheCRUD.findAll();
        cocheCRUD.delete(BMW);

        }





}
