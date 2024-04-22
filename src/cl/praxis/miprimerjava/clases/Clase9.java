package cl.praxis.miprimerjava.clases;

import java.util.Scanner;

public class Clase9 {
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

        for(int i = 0; i<= numero-1; i++){
            if(i % 2 == 0)
                System.out.print("\u001B[32m"+"*"+"\u001B[0m");
            else
                System.out.print("\u001B[31m"+"."+"\u001B[0m");

        }
    }
}
