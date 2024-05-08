package cl.praxis.miprimerjava.clases;

import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //Sumatoria de 0 a 100
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

        //suma 5 a 100 con for
        int suma2 = 0;
        for(int i = 5; i<=100; i++){
            suma2+=i;
        }
        System.out.println(suma2);



        //suma 2i de 3 a 9 con for
        suma2 = 0;
        for(int i = 3; i<=9; i++){
            suma2+=2*i;
        }
        System.out.println(suma2);

        //productoria 1 a 10 con for
        suma2 = 1;
        for(int i = 1; i<=10; i++){
            suma2*=i;
        }
        System.out.println(suma2);
    }
}
