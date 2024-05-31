package cl.praxis.miprimerjava.java;

import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {

        double[] arregloNumeros = new double[10];
        arregloNumeros[0] = 1;
        arregloNumeros[1] = 2;
        arregloNumeros[2] = 3;
        arregloNumeros[3] = 4;
        arregloNumeros[4] = 5;
        arregloNumeros[5] = 6;

        int[] arregloNumeros2 = new int[10];
        arregloNumeros2[0] = 1;
        arregloNumeros2[1] = 2;
        arregloNumeros2[2] = 3;
        arregloNumeros2[3] = 4;
        arregloNumeros2[4] = 5;
        arregloNumeros2[5] = 6;

        String[] arregloTextos = new String[10];
        arregloTextos[0] = "azul";
        arregloTextos[1] = "verde";
        arregloTextos[2] = "rojo";
        arregloTextos[3] = "amarillo";
        arregloTextos[4] = "negro";

        arregloTextos[4] = "Azul Rey";

        /* toString*/
        metodoToString(arregloNumeros);
        metodoToString(arregloNumeros2);
        metodoToString(arregloTextos);

        /* ciclo for para recorrer*/
        System.out.println("ciclo For");
        for (int i=0; i<3; i++){
            arregloNumeros[i]=arregloNumeros[i]+1;
            System.out.println(arregloNumeros[i]);
        }
        /* for each*/
        System.out.println("For Each");
        for(double numero : arregloNumeros){
            System.out.println(numero);
        }


    }

    public static void metodoToString(double[] arregloRecibido){
        System.out.println("toString by Java Util");
        System.out.println(Arrays.toString(arregloRecibido));
    }
    public static void metodoToString(int[] arregloRecibido){
        System.out.println("toString by Java Util");
        System.out.println(Arrays.toString(arregloRecibido));
    }
    public static void metodoToString(String[] arregloRecibido){
        System.out.println("toString by Java Util");
        System.out.println(Arrays.toString(arregloRecibido));
    }
}

