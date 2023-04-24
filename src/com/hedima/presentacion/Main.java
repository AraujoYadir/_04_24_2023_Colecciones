package com.hedima.presentacion;

import com.hedima.modelo.MenorEdad;
import com.hedima.modelo.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 =new Persona("Juan Lopez", 4);
        try {
            p1.comprobarEdad(); // en la bombilla roja asignar try/catch
        } catch (MenorEdad e) {
            System.out.println(e.getMessage());
        }

    }
}