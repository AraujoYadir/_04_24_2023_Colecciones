package com.hedima.presentacion;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio_3{
    public static void main(String[] args) {

            List lista= new ArrayList();
            lista.add(7);
            lista.add(3.14);
            lista.add(false);
            lista.add("Buenos dias");

        System.out.println("La lista es: "+lista);

        System.out.println("\nBucle for para recorrer la lista: ");
        for(Object elemento:lista){
            System.out.println(elemento.toString());
        }

    }
}

