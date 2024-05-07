package cl.praxis.miprimerjava.bibliotecas;

import java.util.ArrayList;

public class JavaUtil01 {

    public static void main(String[] args) {
        arreglo();
    }


    public static void arreglo() {
        // Crear un ArrayList de Strings
        ArrayList<String> miLista = new ArrayList<>();

       // Agregar elementos
        miLista.add("Manzana");
        miLista.add("Banana");
        miLista.add("Naranja");

        System.out.println(miLista);
        System.out.println("///////////////////////////////////");


        // Acceder a un elemento por índice
        System.out.println(miLista.get(2)); // Salida: Banana
        System.out.println("///////////////////////////////////");


        // Recorrer la lista con un bucle for-each
        for(  // miLista se guardó en el objeto fruta que es un String
        String fruta :miLista)
        {
            System.out.println(fruta);
        }
        System.out.println("///////////////////////////////////");

        ArrayList<String> miLista2 = new ArrayList<>();

        // Agregar elementos
        miLista2.add("Piña");
        miLista2.add("Ciruela");
        miLista2.add("Mango");

        System.out.println(miLista2);

        // Remover un elemento
        miLista2.remove(0); // Elimina "Piña"
        System.out.println(miLista2);

        System.out.println("///////////////////////////////////");

        // Verificar si un elemento está en la lista
        boolean contieneCiruela = miLista2.contains("Ciruela"); // true

        // if para comprobar si hay o no ciruela y que lo muestre en pantalla
            if (contieneCiruela == true) {
            System.out.println("Si contiene Ciruela");
            }else {
            System.out.println("No contiene Ciruela");
        }
    }
}

