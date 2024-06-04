package cl.praxis.miprimerjava.java;

import java.util.Arrays;


public class Arreglos {
    public static void main(String[] args) {

        int[] arregloDesordenado = {1,2,30,23,45,25,-12,124,0,-4};
        int[] arregloEnteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] copiaEnteros;


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
        metodoToString(arregloDesordenado);

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

        /* Métodos para arreglos */
        // Min y Max
        System.out.println(metodoTitulo("Min y Max"));
        metodoMinMax(arregloNumeros2);
        metodoMinMax(arregloDesordenado);
        metodoMinMax(arregloNumeros);

        //Metodo Sort
        metodoSort(arregloDesordenado);
        System.out.println("*******************************");

        metodoToString(metodoOrdenador(arregloDesordenado));

        //Metodo copyOf

        copiaEnteros = Arrays.copyOf(arregloEnteros, arregloEnteros.length);
        System.out.println(Arrays.toString(copiaEnteros));
    }
    /******** Metodos ToString*******/
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
        System.out.println(arregloRecibido);
    }

    public static void metodoMinMax(int[] arregloRecibido){
        int min = arregloRecibido[0];
        int max = arregloRecibido[0];

        for(int i=0; i<arregloRecibido.length; i++){
            if(arregloRecibido[i]>max){
                max = arregloRecibido[i];
            }
            if(arregloRecibido[i]<min){
                min = arregloRecibido[i];
            }
        }
        System.out.println("El elemento mínimo: "+min);
        System.out.println("El elemento máximo: "+max);
    }

    public static void metodoMinMax(double[] arregloRecibido){
        double valorMinimo = arregloRecibido[0];
        double valorMaximo = arregloRecibido[0];

        for(int i=0; i<arregloRecibido.length; i++){
           valorMaximo = Math.max(arregloRecibido[i], valorMaximo);
           valorMinimo = Math.min(arregloRecibido[i], valorMinimo);
         }
        System.out.println("El elemento mínimo: "+valorMinimo);
        System.out.println("El elemento máximo: "+valorMaximo);
    }

    public static void metodoSort(int[] arregloRecibido){
        String impresion="";
        impresion = Arrays.toString(arregloRecibido);
        System.out.println("Arreglo Recibido: " + impresion);
        Arrays.sort(arregloRecibido);
        impresion = Arrays.toString(arregloRecibido);
        System.out.println("Arreglo ordenado: " + impresion);
    }

    public static int[] metodoOrdenador(int[] arregloRecibido){
        Arrays.sort(arregloRecibido);
        return arregloRecibido;
    }

    public static String metodoTitulo(String mensajeRecibido){
        String impresion = "Sección título: "+mensajeRecibido;
        System.out.println("entré al método titulo");
        return impresion;
    }
}

