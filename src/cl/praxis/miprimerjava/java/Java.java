package cl.praxis.miprimerjava.java;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        //print
        System.out.println("Hola Mundo");
        /********************** Declaración de Variables********************/
        //alias de las variables -> inician en minuscula y con camelCase
        //Variables Nativas
        int variableEntera;
        float variableDecimal;
        double variableDecimalDouble;
        boolean variableBoolean;
        char variableCaracter;
        long variableLong;

        //Variables de Clase -> Tienen metodos predeterminado
        String variableCadenasTexto;
        Integer variableEnteras;
        Float variableFloat;
        Double variableDouble;
        Long variableLarga;
        Boolean variableBooleana;
        Character variableCaracteres;
        Date variableFechaJavaOriginal;
        LocalDate variableFechaJava;
        Byte variableByte;

        /***** Inicializar Varaibles*****/
        int numero = -12;
        String nombre = "Felipe";
        String nombre2 = new String("Felipe");

        /****Operaciones****/
        int suma = 10 +2;
        int resta = 16 - 5;
        double division = 5/2;
        int multiplicacion = suma * resta;
        int modulo = 10 % 2;

        /***operaciones logicas***/
        //&& = "y"
        //|| = "o"
        //< menor que
        //> mayor que
        //<= menor o igual qué
        //>= mayor o igual qué
        //!= distinto qué
        //== comparación de igualdad

        /***Condicionales***/
        //() -> condición mediante una operación lógica
        if (modulo == 0){
            //Aquí va el bloque de código si la condición es true
            System.out.println("El modulo es: " + modulo);
        }else{
            System.out.println("El modulo es distinto de cero: " + modulo);
        }
        //Condicional para manejo de excepciones
        Scanner sc = new Scanner(System.in);

        try{
            //Bloque de código que se va a ejecutar
            System.out.println("Ingrese el valor de variable entera");
        }catch (Exception e){
            //bloque de código que se ejecuta en caso de un error
            System.out.println("No se puede ingresar el valor de variable entera");
        }finally {
            //bloque de codigo que se ejecuta igual con error o sin error y es opcional
            sc.close();
        }

        /****ciclos***/

        while(numero<0){
            System.out.println("El numero es: " + numero+" es negativo");
            numero++;
            // numero = numero +1;
        }
        //Se ejecuta al menos una vez
        do{
            //aqui va el bloque de codigo que se ejecuta mientras se cumpla la condición
        }while (numero<0);

        for(int i=0; i<10;i++){
            //bloque de código
        }






    }
}
