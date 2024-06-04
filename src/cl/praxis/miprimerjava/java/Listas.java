package cl.praxis.miprimerjava.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Hola1");
        lista.add("Hola2");
        lista.add("Hola3");
        lista.add("Hola4");
        lista.add("Hola5");

        String[] prueba = {"Hola1", "Hola2", "Hola3", "Hola4"};
        String[] nuevaPrueba = Arrays.copyOf(prueba, 3);

        List<String> copia = new ArrayList<>(lista);
        lista.set(1, "jajajaj");
        System.out.println(lista);

        System.out.println(copia);

        System.out.println("----------------------------------------------------");
        System.out.println("La lista contiene: " + lista.size() + " Elementos");
        System.out.println("El Index de 'Hola4' es: " + lista.indexOf("Hola4"));
        System.out.println("La lista contiene 'Hola8'? " + lista.contains("Hola8"));
        System.out.println("El elemento 3 de la lista es: " + lista.get(3));
        System.out.println("Los elementos de la lista son:" + lista);
        for(String el: lista){
            System.out.println("Elemento: " + el);
        }
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento: " + lista.get(i));
        }
        System.out.println("----------------------------------------------------");

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(25);
        listaNumeros.add(258);
        listaNumeros.add(35);
        listaNumeros.add(2);
        listaNumeros.add(21);

        // modificar elemento dentro de la lista
        listaNumeros.set(3, 35);


        System.out.println(listaNumeros.get(3));

        System.out.println("----------------------------------------------------");
        System.out.println("La lista contiene: " + listaNumeros.size() + " Elementos");
        System.out.println("El Index de 2 es: " + listaNumeros.indexOf(2));
        System.out.println("La lista contiene 300? " + listaNumeros.contains(300));
        System.out.println("El elemento 3 de la lista es: " + listaNumeros.get(3));
        System.out.println("Los elementos de la lista son:" + listaNumeros);

        for(int el: listaNumeros){
            System.out.println("Elemento: " + el);
        }
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println("Elemento: " + listaNumeros.get(i));
        }
        System.out.println("----------------------------------------------------");

    }

}
