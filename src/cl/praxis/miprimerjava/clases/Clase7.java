package cl.praxis.miprimerjava.clases;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Clase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejemplo 1 while
//        System.out.println("Ingresa un numero entre el 1 y el 10");
//        int numero = sc.nextInt();
//        while (!(numero >= 1 && numero <= 10)) {
//            System.out.println("El numero debe ser entre 1 y 10, ingresalo otra vez");
//            numero = sc.nextInt();
//        }
//        System.out.printf("El numero es %d", numero);

        //Ejemplo 2 while
//        System.out.println("ingrese su pass");
//        String pass = sc.nextLine();
//        String validacion = "password";
//        while(!pass.equals(validacion)) {
//            System.out.println("tu contra esta trb mala");
//            pass = sc.nextLine();
//        }
//        System.out.println("pase");

        //Ejemplo 1 do while

//        int numero;
//        do {
//            System.out.println("ingresa un numero enrte el 1 y el 10");
//            numero = sc.nextInt();
//        }while (numero < 1 || numero > 10);
//        System.out.printf("El numero es %d", numero);

        //Ejemplo ciclo FOR

//        for (int i = 10 ;i>0;i--){
//            try {
//                System.out.println(i);
//                TimeUnit.SECONDS.sleep(1);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }

        int contador = 0;
        int suma=0;
        while (contador<=100){

            suma+=contador;
            /*
            a+=1 -> a = a+1
            */
            contador +=1;
        }
        System.out.println(suma);
    }
}
