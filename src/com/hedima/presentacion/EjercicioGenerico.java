package com.hedima.presentacion;

import java.util.HashSet;
import java.util.Set;

public class EjercicioGenerico {

    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();

        strings.add("Hola");
        strings.add("Adiós");
        strings.add("Hasta luego");
        strings.add("Hasta mañana");
        strings.add("Hasta pronto");

        System.out.println(strings);
    }
}