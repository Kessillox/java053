package cl.praxis.miprimerjava.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {

        /************** Variables y tipos de datos *******************/
        /*Primitivos*/
        int numeroEntero=0;
        char caracter;
        float numeroFlotante;
        double numeroDoblado;
        boolean booleano;
        long numeroLargo;
        short numeroCorto;

        /* Clases */
        String claseTexto="";
        Integer claseEntero;
        Double claseDouble;
        Float claseFloat;
        Character claseChar;
        Boolean claseBooleana;
        Date claseDate;
        LocalDate claseLocalDate;
        LocalTime claseLocalTime;
        LocalDateTime claseLocalDateTime;

        /*
        * private -> dentro de la misma clase
        * public -> abierto al público
        * default -> dentro del paquete
        * protected -> clases y subclases pero no las súper
         */
        //Obj scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        claseTexto = scanner.nextLine();
        // condicional
        if(/*aqu+i va la condición*/ claseTexto.trim().isEmpty()){
            System.out.println("el texto está vacío");
        } else if (claseTexto.contains("h")) {
            System.out.println("h");
        }else{
            claseTexto = claseTexto.trim();
            System.out.println(claseTexto);
        }

        int contador = 2;
        int contador2 = 0;

//        do{
//            System.out.println("aqui van las lineas de código");
//            System.out.println(contador);
//            System.out.println(contador2);
//            contador2+=contador;
//        }while(contador<5);

//        while(contador2<5){
//            System.out.println(contador2);
//            contador2+=contador;
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.printf("%d%d \n", i,j);
//
//            }
//        }
    }
}
