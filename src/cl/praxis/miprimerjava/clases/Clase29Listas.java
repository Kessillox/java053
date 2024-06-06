package cl.praxis.miprimerjava.clases;

import java.util.ArrayList;
import java.util.List;

public class Clase29Listas {
    public static void main(String[] args) {
        ArrayList<String> listaCiudades = new ArrayList<>();
        List<Integer> listaNumeros = new ArrayList<>();
        ArrayList<String> listaCiudadesSur = new ArrayList<>();
        String ciudad1 = "Viña Del Mar";

        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        System.out.println("******************************");
        System.out.println(listaNumeros);

        listaCiudades.add("Limache");
        listaCiudades.add("Valparaíso");
        listaCiudades.add(ciudad1);
        listaCiudades.add("Quilpue");
        listaCiudades.add("Bucalemu");
        System.out.println("******************************");
        System.out.println(listaCiudades);

        listaCiudadesSur.add("Talcahuano");
        listaCiudadesSur.add("Concepción");
        listaCiudadesSur.add("Bucalemu");
        listaCiudadesSur.add("Chiguayante");
        listaCiudadesSur.add("Bucalemu");
        System.out.println("******************************");
        System.out.println(listaCiudadesSur);

        listaCiudades.addAll(listaCiudadesSur);
        System.out.println("******************************");
        System.out.println(listaCiudades);

        System.out.println(listaCiudades.indexOf("Bucalemu"));
        System.out.println(listaCiudades.lastIndexOf("Bucalemu"));

        listaCiudades.remove("Bucalemu");

        System.out.println("******************************");
        System.out.println(listaCiudades);

        for(String ciudad : listaCiudades) {
            System.out.println(ciudad);
        }

        listaCiudades.removeIf(elemento -> elemento.equals("Bucalemu"));
        System.out.println("******************************");
        System.out.println(listaCiudades);

        System.out.println("******************************");
        System.out.println(listaCiudades.get(5));

    }
}
