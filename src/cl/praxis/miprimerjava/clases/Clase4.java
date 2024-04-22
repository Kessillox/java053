package cl.praxis.miprimerjava.clases;

import java.util.Scanner;

public class Clase4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Es menor de edad");
        }else if (edad > 18) {
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("No es ni mayor ni menor de 18");
        }

        System.out.println("ingresa primer texto");
        String texto1 = sc.next();
        System.out.println("ingresa segundo texto");
        String texto2 = sc.next();

        if (texto1.equals(texto2)){
            System.out.println("los textos son iguales");
        } else {
            System.out.println("los textos son diferentes");
        }
        System.out.println(texto1.compareTo(texto2));*/

        System.out.println("Ingrese su Porcentaje");
        int porcentaje = sc.nextInt();

        if (porcentaje == 0) {
            System.out.println("Pendiente");
        }else if (porcentaje <= 99 && porcentaje > 0) {
            System.out.println("En Proceso");
        }else if(porcentaje == 100){
            System.out.println("Terminado");
        }else {
            System.out.println("Ingrese un valor correcto");
        }

        if (porcentaje > 0) {
            System.out.println("Pendiente");
            if(porcentaje <= 99) {
                System.out.println("En Proceso");
            }else if(porcentaje == 100) {
                System.out.println("Terminado");
            }else {
                System.out.println("Ingrese un valor menor o igual a 100");
            }
        }else {
            System.out.println("ingrese un valor positivo");
        }

    }
}
