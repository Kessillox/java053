package cl.praxis.miprimerjava.clases;

import java.util.Scanner;

public class Clase9 {


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
        //Dibujo de asteriscos
//        System.out.println("Ingrese un número para dibujar puntitos: ");
//        int numero = sc.nextInt();
//        for(int i = 0; i<= numero; i++){
//            System.out.print("\u001B[32m"+"*"+"\u001B[0m");
//        }

        //dibujo asteriscos y puntos
        System.out.println("Ingrese un número para dibujar puntitos: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= numero - 1; i++) {
            if (i % 2 == 0)
                System.out.print("\u001B[32m" + "*" + "\u001B[0m");
            else
                System.out.print("\u001B[31m" + "." + "\u001B[0m");
        }
//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 11; j++) {
//                //System.out.printf(ANSI_BLUE+"%d * %d ="+ANSI_GREEN+" %d\n", i, j, i*j);
//                System.out.println(ANSI_BLUE+i+" * "+j+ANSI_WHITE+" = "+ANSI_RED+i*j );
//            }
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.print(ANSI_BLUE + "*");
//        }
    }
}
