package cl.praxis.miprimerjava.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Clase13 {
    public static void main(String[] args) {
//        int [] edades;
//        String [] nombres;
//        edades = new int [5];
//        ArrayList<Integer> lista = new ArrayList<>();
//        edades[0] = 37;
//        edades[1] = 38;
//        edades[2] = 39;
//        edades[3] = 40;
//        edades[4] = 41;
//
//        lista.add(37);
//        lista.add(38);
//        lista.remove(0);
//        lista.add(39);
//
//        nombres = new String[] {"Rudi","Fco","caro", "Ion","nico"};
//
//        for (int i = 0; i < edades.length; i++) {
//            System.out.println(edades[i] + " ");
//        }
//
//        System.out.println(Arrays.toString(edades));
//        System.out.println(Arrays.toString(nombres));
//        //Imprimir lista
//        System.out.println(Arrays.toString(lista.toArray()));
        System.out.println(suma());

        //********************Sesion 2¨***************

        ArrayList<String> listaStrings = new ArrayList<String>();
        listaStrings.add("1");
        listaStrings.add("2");
        listaStrings.add("3");
        System.out.println(listaStrings);


        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaIngredientes = new ArrayList<>();
        listaIngredientes.add("Salsa de Tomate");
        listaIngredientes.add("Tomate");
        listaIngredientes.add("Jamón");
        listaIngredientes.add("Queso");
        listaIngredientes.add("Champiñones");

        System.out.println("ingresa un ingrediente nuevo");
        String ingrediente = sc.nextLine();

        if (ingrediente.equals("clear")){
            listaIngredientes.clear();
        }else if (listaIngredientes.contains(ingrediente)) {
            System.out.println("el ingrediente ya existe");
            listaIngredientes.remove(ingrediente);
        }else {
            listaIngredientes.add(ingrediente);
            System.out.println("ingrediente agregado");
        }

        listaIngredientes.remove(1);
        System.out.println(listaIngredientes);

        //segundo ejemplo

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(3);
        listaNumeros.add(5);
        listaNumeros.add(7);
        listaNumeros.add(9);

        System.out.println("ingresa un ingrediente nuevo");
        int numero = sc.nextInt();

        if (numero == 0){
            listaNumeros.clear();
        }else if (listaNumeros.contains(numero)) {
            System.out.println("el ingrediente ya existe");
            listaNumeros.remove(numero);
        }else {
            if(numero % 2 != 0) {
                listaNumeros.add(numero);
                System.out.println("ingrediente agregado");
            }else {
                System.out.println("ingrese un numero impar");
            }
        }

        listaNumeros.remove(1);
        System.out.println(listaNumeros);
    }
    public static double suma(){
        double suma = 0;
        double [] numeros = new double[] {(Math.random()),(Math.random()),(Math.random()),(Math.random()),(Math.random()),(Math.random()),(Math.random())};
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        suma = suma*10;
        return suma;
    }
}
