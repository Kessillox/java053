package cl.praxis.miprimerjava.clases;

import java.util.Scanner;

public class Clase10 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        imprimirCadena();
        System.out.println("Selecciona la opción");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                int suma = 10;
                instruccionSumar();
                instruccionIngreso1();
                int a = sc.nextInt();
                instruccionIngreso2();
                int b = sc.nextInt();
                System.out.println(sumar(20,5));
                break;
            case 2:
                imprimirCadena();
                break;
            default:
                break;
        }
    }

    static void imprimirCadena(){
        System.out.println(ANSI_WHITE+"***********"+ANSI_BLUE+"Menú"+ANSI_RED+"*************");
        System.out.println(ANSI_CYAN+"Opcion 1");
        System.out.println(ANSI_CYAN+"Opcion 2");
        System.out.println(ANSI_CYAN+"Opcion 3");
    }
    static int  sumar(int numero1, int numero2){
        System.out.println(numero1 + " + " + numero2);
        int suma = numero1 + numero2;
        return suma;
    }
    static void instruccionSumar(){
        System.out.println("Haz ingresado al método Sumar");
    }
    static void instruccionIngreso1(){
        System.out.println("Ingresa un primer número");
    }
    static void instruccionIngreso2(){
        System.out.println("Ingresa un segundo número");
    }

}
