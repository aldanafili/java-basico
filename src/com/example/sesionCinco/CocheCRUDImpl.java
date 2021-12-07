package com.example.sesionCinco;
import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
            coches.add(coche);
        System.out.println("Guarda un coche");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Lista" + coches);
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        coches.remove(coche);
        System.out.println("Elimina un coche");

    }
}
