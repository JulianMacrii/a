package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
       /*
       ArrayList<String> arrPalabras = new ArrayList<>();
       arrPalabras.add("hola");
       arrPalabras.add("Palabra");
       arrPalabras.add("chau");
       arrPalabras.add("si");

        //recorrer con iterador
        Iterator<String> it = arrPalabras.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        arrPalabras.forEach(System.out::println); //programacion funcional

        while(it.hasNext()){
            if(it.next().equals("hola")){
                it.remove();
            }
        }

        arrPalabras.forEach(System.out::println);
        */
        Triangulo t1 = new Triangulo(2.0,4.0);

        Cuadrado c1 = new Cuadrado(4);

        Figura f = new Cuadrado(2);
        f = new Triangulo(8.0,2.0);

        /*
        t1.dibujar();
        System.out.println("area del triangulo: " + t1.calcularArea());
        c1.dibujar();
        System.out.println("area del cuadrado: " + c1.calcularArea());
        */

        System.out.println(f.calcularArea());
    }
}