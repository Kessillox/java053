package cl.praxis.miprimerjava.bibliotecas;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class JavaUtil01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos a JavaUtil01");
        System.out.println("Aquí se encontrarán las clases y metodos principales del paquete 'Java util' ");
        System.out.println("¿Con cuál te gustaría empezar?");
        System.out.println("1.- Collections");
        System.out.println("2.- Arrays");
        System.out.println("3.- Scanner");
        int option1 = sc.nextInt();
        System.out.println("Has elegido :" + option1);
        System.out.println("Los Collections en Java son como cajas de herramientas gigantes que contienen diferentes tipos de recipientes (clases) para almacenar y organizar datos.\nEstos recipientes vienen en varias formas y tamaños, cada uno con sus propias características y usos específicos.");
        System.out.println("Dentro de estos se encuentran: ");
        System.out.println("1.- Arrays");
        System.out.println("2.- HashMap");
        System.out.println("3.- HashSet");
        System.out.println("4.- TreeMap");
        System.out.println("5.- Scanner");
        System.out.println("6.- Volver al menú principal");
        System.out.println("Elige una opción para mayor información");
        int option2 = sc.nextInt();

        switch (option2){
            case 1:
                System.out.println("Arrays y sus métodos");
                miArreglo();
                break;
            case 2:
                System.out.println("HashMap");
                miHashMap();
                break;
            case 3:
                System.out.println("HashSet");
                miHashSet();
                break;
            case 4:
                System.out.println("TreeMap");
                miTreeMap();
                break;
            case 5:
                System.out.println("Scanner");
                miScanner();
                break;
            case 6:

                break;
        }
        miArreglo();
    }


    public static void miArreglo() {
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

    public static void miHashMap() {
        // Crear un HashMap de Strings e Integers
        HashMap<String, Integer> edades = new HashMap<>();

// Agregar elementos clave-valor
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Pedro", 28);

// Acceder a un valor por clave
        int edadJuan = edades.get("Juan"); // 25

// Recorrer el mapa con un bucle for-each
        for (Map.Entry<String, Integer> entry : edades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

// Verificar si una clave existe
        boolean existeJuan = edades.containsKey("Juan"); // true

// Remover un elemento por clave
        edades.remove("Pedro");
    }

    public static void miHashSet () {
        // Crear un HashSet para almacenar nombres de frutas
        HashSet<String> frutas = new HashSet<>();

        // Agregar elementos al HashSet usando el método add()
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        // Imprimir el HashSet
        System.out.println("HashSet de frutas: " + frutas);

        // Verificar si un elemento está presente en el HashSet
        boolean contieneNaranja = frutas.contains("Naranja");
        System.out.println("¿El HashSet contiene 'Naranja'? " + contieneNaranja);

        // Eliminar un elemento del HashSet
        frutas.remove("Banana");
        System.out.println("HashSet después de eliminar 'Banana': " + frutas);

        // Obtener el tamaño del HashSet
        int tamaño = frutas.size();
        System.out.println("Tamaño del HashSet: " + tamaño);

        // Verificar si el HashSet está vacío
        boolean estaVacio = frutas.isEmpty();
        System.out.println("¿El HashSet está vacío? " + estaVacio);

        // Limpiar el HashSet (eliminar todos los elementos)
        frutas.clear();
        System.out.println("HashSet después de limpiar: " + frutas);
    }

    public static void miTreeMap () {
        // Crear un TreeMap para almacenar nombres de personas y sus edades
        TreeMap<String, Integer> edades = new TreeMap<>();

        // Agregar elementos al TreeMap usando el método put()
        edades.put("Juan", 30);
        edades.put("María", 25);
        edades.put("Pedro", 35);

        // Imprimir el TreeMap
        System.out.println("TreeMap de edades: " + edades);

        // Obtener el valor asociado con una clave usando el método get()
        int edadJuan = edades.get("Juan");
        System.out.println("La edad de Juan es: " + edadJuan);

        // Verificar si una clave está presente en el TreeMap usando el método containsKey()
        boolean contieneMaria = edades.containsKey("María");
        System.out.println("¿El TreeMap contiene a María? " + contieneMaria);

        // Eliminar un elemento del TreeMap usando el método remove()
        edades.remove("Pedro");
        System.out.println("TreeMap después de eliminar a Pedro: " + edades);

        // Obtener el tamaño del TreeMap usando el método size()
        int tamaño = edades.size();
        System.out.println("Tamaño del TreeMap: " + tamaño);

        // Verificar si el TreeMap está vacío usando el método isEmpty()
        boolean estaVacio = edades.isEmpty();
        System.out.println("¿El TreeMap está vacío? " + estaVacio);

        // Limpiar el TreeMap (eliminar todos los elementos) usando el método clear()
        edades.clear();
        System.out.println("TreeMap después de limpiar: " + edades);
    }

    public static void miScanner () {
        // Crear un objeto Scanner para leer entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Leer un entero desde la consola usando nextInt()
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();
        System.out.println("Número ingresado: " + numeroEntero);

        // Leer un número decimal desde la consola usando nextDouble()
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("Número decimal ingresado: " + numeroDecimal);

        // Leer una línea de texto desde la consola usando nextLine()
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Ingrese una línea de texto: ");
        String lineaTexto = scanner.nextLine();
        System.out.println("Línea de texto ingresada: " + lineaTexto);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}

