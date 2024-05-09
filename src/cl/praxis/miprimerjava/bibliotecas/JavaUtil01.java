package cl.praxis.miprimerjava.bibliotecas;

import java.util.*;

public class JavaUtil01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos a JavaUtil01");
        int option=0;
        do {
            System.out.println("Aquí se encontrarán las clases y metodos principales del paquete 'Java util' ");
            System.out.println("¿Con cuál te gustaría empezar?");
            System.out.println("1.- Collections");
            System.out.println("2.- Arrays");
            System.out.println("3.- Scanner");
            System.out.println("4.- Salir");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    mostrarInfoCollection();
                    break;
                case 2:
                    mostrarInfoArrays();
                    break;
                case 3:
                    mostrarInfoScanner();

            }

        } while (!(option == 4));

    }

        public static void mostrarInfoCollection () {
            Scanner sc = new Scanner(System.in);
            int option2;
            do {
                System.out.println();
                System.out.println("Los Collections en Java son como cajas de herramientas gigantes que contienen diferentes tipos de recipientes (clases) para almacenar y organizar datos.\nEstos recipientes vienen en varias formas y tamaños, cada uno con sus propias características y usos específicos.");
                System.out.println();
                System.out.println("Dentro de estos se encuentran: ");
                System.out.println();
                System.out.println("Los de tipo Lista: ");
                System.out.println("1.- ArrayList");
                System.out.println("2.- LinkedList");
                System.out.println();
                System.out.println("Los de Conjuntos: ");
                System.out.println("3.- HashSet");
                System.out.println("4.- Treeset");
                System.out.println();
                System.out.println("De tipo Mapas: ");
                System.out.println("5.- HashMap");
                System.out.println("6.- TreeMap");
                System.out.println();
                System.out.println("Tipo colas: ");
                System.out.println("7.-LinkedList");
                System.out.println("8.-Prority Queue");
                System.out.println();
                System.out.println("Tipo Pilas: ");
                System.out.println("9.-Array Deque");
                System.out.println("10.-LinkedList como tipo pilas");
                System.out.println();
                System.out.println("11.- Volver al menú principal");
                System.out.println();
                System.out.println("Elige una opción para mayor información");
                System.out.println();
                option2 = sc.nextInt();
                sc.nextLine();
                System.out.println();
                switch (option2) {
                    case 1:
                        System.out.println("ArrayList");
                        miArrayList();
                        break;
                    case 2:
                        System.out.println("LinkedList");
                        miLinkedList();
                        break;
                    case 3:
                        System.out.println("HashSet");
                        miHashSet();
                        break;
                    case 4:
                        System.out.println("TreeSet");
                        miTreeSet();
                        break;
                    case 5:
                        System.out.println("HashMap");
                        miHashMap();
                        break;
                    case 6:
                        System.out.println("TreeMap");
                        miTreeMap();
                        break;
                    case 7:
                        System.out.println("LinkedList como cola");
                        miLinkedListCola();
                        break;
                    case 8:
                        System.out.println("Priority Queue");
                        miPriorityQueue();
                        break;
                    case 9:
                        System.out.println("Array Deque");
                        miArrayDeque();
                        break;
                    case 10:
                        System.out.println("LinkedList como tipo pilas");
                        miArrayListPilas();
                        break;
                    case 11:
                        System.out.println("Salir al menu principal");

                }
            } while (!(option2 == 11));
        }

        public static void mostrarInfoArrays() {
            Scanner sc = new Scanner(System.in);
            int option3 = 0;
            System.out.println("Para mayor info revisa los comentarios en el código");
            System.out.println();
                System.out.println("La clase Array en Java es una herramienta que te permite almacenar una colección ordenada de elementos del mismo tipo.\n" +
                        " Imagina un contenedor donde puedes guardar varios valores del mismo tipo, como números enteros, números decimales o cadenas de \n" +
                        "texto. Estos valores se organizan en posiciones específicas dentro del contenedor, y cada posición tiene un índice que la identifica.");
                System.out.println();
                int[] numeros = {5, 2, 8, 1, 9};

                // Ordenar la matriz
                Arrays.sort(numeros);
                System.out.println("Matriz ordenada: " + Arrays.toString(numeros)); // Salida: Matriz ordenada: [1, 2, 5, 8, 9]
                System.out.println();

                // Buscar un valor en la matriz
                int indice = Arrays.binarySearch(numeros, 8);
                System.out.println("Índice del valor 8: " + indice); // Salida: Índice del valor 8: 3
                System.out.println();

                // Rellenar la matriz con un valor
                Arrays.fill(numeros, 0);
                System.out.println("Matriz rellenada: " + Arrays.toString(numeros)); // Salida: Matriz rellenada: [0, 0, 0, 0, 0]
                System.out.println();
            do {
                System.out.println("Dentro de las clases de Arrays tenemos los siguientes métodos:");
                System.out.println();
                System.out.println("1.- sort");
                System.out.println();
                System.out.println("2.- binarySearch");
                System.out.println();
                System.out.println("3.- equals");
                System.out.println();
                System.out.println("4.- fill");
                System.out.println();
                System.out.println("5.- copyOf");
                System.out.println();
                System.out.println("6.- toString");
                System.out.println();
                System.out.println("7.- asList");
                System.out.println();
                System.out.println("8.- Volver al menú principal");
                System.out.println();
                System.out.print("Selecciona una opción: ");
                System.out.println();
                option3 = sc.nextInt();
                sc.nextLine();

                switch  (option3) {
                    case 1:
                        System.out.println("1.- sort");
                        miSort();
                        break;
                    case 2:
                        System.out.println("2.- binarySearch");
                        miBinarySearch();
                        break;
                    case 3:
                        System.out.println("3.- equals");
                        miEquals();
                        break;
                    case 4:
                        System.out.println("4.- fill");
                        miFill();
                        break;
                    case 5:
                        System.out.println("5.- copyOf");
                        miCopyOf();
                        break;
                    case 6:
                        System.out.println("6.- toString");
                        miToString();
                        break;
                    case 7:
                        System.out.println("7.- asList");
                        miAsList();
                        break;
                    case 8:
                        System.out.println("8.- Volver al menú principal");
                        break;
                }

            }while (!(option3 == 8));
        }
        public static void mostrarInfoScanner() {
            System.out.println("Para mayor info revisa los comentarios en el código");
            System.out.println();
            System.out.println("La clase Scanner es una herramienta útil en Java que te permite leer datos de entrada desde diferentes fuentes,\n" +
                        " como la entrada estándar (por ejemplo, el teclado) o un archivo. Con Scanner, puedes leer diferentes tipos de datos,\n" +
                        " como enteros, números decimales, cadenas de texto, etc.\n" +
                        "\n" +
                        "Para usar la clase Scanner, primero debes crear un objeto de tipo Scanner, y luego puedes usar métodos como nextInt(), \n" +
                        "nextDouble(), nextLine(), entre otros, para leer los datos de entrada según el tipo que necesites.");
            System.out.println();

            Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer desde la entrada estándar

            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.nextLine(); // Lee una línea completa de entrada

            System.out.print("Ingresa tu edad: ");
            int edad = scanner.nextInt(); // Lee un entero de entrada

            System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");


        }

        public static void miArrayList () {
            System.out.println("Para mayor info revisa los comentarios en el código");
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
            for (  // miLista se guardó en el objeto fruta que es un String
                    String fruta : miLista) {
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
            } else {
                System.out.println("No contiene Ciruela");
            }

        }

        public static void miLinkedList () {
            System.out.println("Para mayor info revisa los comentarios en el código");
            // Crear una LinkedList para almacenar nombres de personas
            LinkedList<String> nombres = new LinkedList<>();

            // Agregar elementos al final de la LinkedList usando add()
            nombres.add("Juan");
            nombres.add("María");
            nombres.add("Pedro");

            // Imprimir la LinkedList
            System.out.println("LinkedList de nombres: " + nombres);

            // Agregar un elemento al principio de la LinkedList usando addFirst()
            nombres.addFirst("Ana");
            System.out.println("LinkedList después de agregar 'Ana' al principio: " + nombres);

            // Agregar un elemento al final de la LinkedList usando addLast()
            nombres.addLast("Luis");
            System.out.println("LinkedList después de agregar 'Luis' al final: " + nombres);

            // Obtener el primer elemento de la LinkedList usando getFirst()
            String primerNombre = nombres.getFirst();
            System.out.println("El primer nombre en la LinkedList es: " + primerNombre);

            // Obtener el último elemento de la LinkedList usando getLast()
            String ultimoNombre = nombres.getLast();
            System.out.println("El último nombre en la LinkedList es: " + ultimoNombre);

            // Eliminar el primer elemento de la LinkedList usando removeFirst()
            nombres.removeFirst();
            System.out.println("LinkedList después de eliminar el primer elemento: " + nombres);

            // Eliminar el último elemento de la LinkedList usando removeLast()
            nombres.removeLast();
            System.out.println("LinkedList después de eliminar el último elemento: " + nombres);

            // Verificar si un elemento está presente en la LinkedList usando contains()
            boolean contieneMaria = nombres.contains("María");
            System.out.println("¿La LinkedList contiene 'María'? " + contieneMaria);

            // Obtener el tamaño de la LinkedList usando size()
            int tamaño = nombres.size();
            System.out.println("Tamaño de la LinkedList: " + tamaño);

            // Limpiar la LinkedList usando clear()
            nombres.clear();
            System.out.println("LinkedList después de limpiar: " + nombres);
        }

        public static void miHashMap () {
            System.out.println("Para mayor info revisa los comentarios en el código");
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
            System.out.println("Para mayor info revisa los comentarios en el código");
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
        public static void miTreeSet () {
            System.out.println("Para mayor info revisa los comentarios en el código");
            // Crear un TreeSet para almacenar números enteros
            TreeSet<Integer> numeros = new TreeSet<>();

            // Agregar elementos al TreeSet usando add()
            numeros.add(5);
            numeros.add(2);
            numeros.add(8);
            numeros.add(1);

            // Imprimir el TreeSet
            System.out.println("TreeSet de números: " + numeros);

            // Obtener el primer elemento del TreeSet usando first()
            int primerNumero = numeros.first();
            System.out.println("El primer número en el TreeSet es: " + primerNumero);

            // Obtener el último elemento del TreeSet usando last()
            int ultimoNumero = numeros.last();
            System.out.println("El último número en el TreeSet es: " + ultimoNumero);

            // Obtener y eliminar el primer elemento del TreeSet usando pollFirst()
            int primerNumeroEliminado = numeros.pollFirst();
            System.out.println("Número eliminado del principio: " + primerNumeroEliminado);
            System.out.println("TreeSet después de eliminar el primer número: " + numeros);

            // Obtener y eliminar el último elemento del TreeSet usando pollLast()
            int ultimoNumeroEliminado = numeros.pollLast();
            System.out.println("Número eliminado del final: " + ultimoNumeroEliminado);
            System.out.println("TreeSet después de eliminar el último número: " + numeros);

            // Verificar si un elemento está presente en el TreeSet usando contains()
            boolean contieneCinco = numeros.contains(5);
            System.out.println("¿El TreeSet contiene el número 5? " + contieneCinco);

            // Obtener el tamaño del TreeSet usando size()
            int tamaño = numeros.size();
            System.out.println("Tamaño del TreeSet: " + tamaño);

            // Limpiar el TreeSet usando clear()
            numeros.clear();
            System.out.println("TreeSet después de limpiar: " + numeros);

        }

        public static void miTreeMap () {
            System.out.println("Para mayor info revisa los comentarios en el código");
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

        public static void miLinkedListCola () {
            System.out.println("Para mayor info revisa los comentarios en el código");
            // Crear una LinkedList para simular una cola
            LinkedList<String> cola = new LinkedList<>();

            // Agregar elementos a la cola usando offer() o add()
            cola.offer("Cliente1");
            cola.offer("Cliente2");
            cola.offer("Cliente3");

            // Imprimir la cola
            System.out.println("Cola de clientes: " + cola);

            // Obtener y eliminar el primer elemento de la cola usando poll()
            String clienteAtendido = cola.poll();
            System.out.println("Cliente atendido: " + clienteAtendido);
            System.out.println("Cola después de atender al cliente: " + cola);

            // Obtener el primer elemento de la cola sin eliminarlo usando peek()
            String proximoCliente = cola.peek();
            System.out.println("Próximo cliente en la cola: " + proximoCliente);
            System.out.println("Cola después de consultar al próximo cliente: " + cola);

            // Verificar si la cola está vacía usando isEmpty()
            boolean estaVacia = cola.isEmpty();
            System.out.println("¿La cola está vacía? " + estaVacia);

            // Obtener el tamaño de la cola usando size()
            int tamaño = cola.size();
            System.out.println("Tamaño de la cola: " + tamaño);

            // Limpiar la cola usando clear()
            cola.clear();
            System.out.println("Cola después de limpiar: " + cola);
        }

        public static void miPriorityQueue () {
            System.out.println("Para mayor info revisa los comentarios en el código");
            // Crear una PriorityQueue para simular una cola de prioridad
            PriorityQueue<Integer> colaPrioridad = new PriorityQueue<>();

            // Agregar elementos a la cola de prioridad usando offer() o add()
            colaPrioridad.offer(10);
            colaPrioridad.offer(5);
            colaPrioridad.offer(15);
            colaPrioridad.offer(3);

            // Imprimir la cola de prioridad
            System.out.println("Cola de prioridad: " + colaPrioridad);

            // Obtener y eliminar el elemento de mayor prioridad de la cola de prioridad usando poll()
            int elementoRemovido = colaPrioridad.poll();
            System.out.println("Elemento removido de la cola de prioridad: " + elementoRemovido);
            System.out.println("Cola de prioridad después de remover el elemento: " + colaPrioridad);

            // Obtener el elemento de mayor prioridad de la cola de prioridad sin eliminarlo usando peek()
            int proximoElemento = colaPrioridad.peek();
            System.out.println("Próximo elemento en la cola de prioridad: " + proximoElemento);
            System.out.println("Cola de prioridad después de consultar el próximo elemento: " + colaPrioridad);

            // Verificar si la cola de prioridad está vacía usando isEmpty()
            boolean estaVacia = colaPrioridad.isEmpty();
            System.out.println("¿La cola de prioridad está vacía? " + estaVacia);

            // Obtener el tamaño de la cola de prioridad usando size()
            int tamaño = colaPrioridad.size();
            System.out.println("Tamaño de la cola de prioridad: " + tamaño);

            // Limpiar la cola de prioridad usando clear()
            colaPrioridad.clear();
            System.out.println("Cola de prioridad después de limpiar: " + colaPrioridad);
        }

        public static void miArrayDeque () {
            System.out.println("Para mayor info revisa los comentarios en el código");
            // Crear un ArrayDeque para simular una pila de números
            ArrayDeque<Integer> pilaNumeros = new ArrayDeque<>();

            // Agregar elementos a la pila usando push() o addFirst()
            pilaNumeros.push(1);
            pilaNumeros.push(2);
            pilaNumeros.push(3);

            // Imprimir la pila de números
            System.out.println("Pila de números: " + pilaNumeros);

            // Obtener y eliminar el elemento superior de la pila usando pop() o removeFirst()
            int numeroEliminado = pilaNumeros.pop();
            System.out.println("Número eliminado de la pila: " + numeroEliminado);
            System.out.println("Pila después de eliminar el número: " + pilaNumeros);

            // Obtener el elemento superior de la pila sin eliminarlo usando peek() o getFirst()
            int numeroSuperior = pilaNumeros.peek();
            System.out.println("Número superior en la pila: " + numeroSuperior);
            System.out.println("Pila después de consultar el número superior: " + pilaNumeros);

            // Verificar si la pila está vacía usando isEmpty()
            boolean estaVacia = pilaNumeros.isEmpty();
            System.out.println("¿La pila está vacía? " + estaVacia);

            // Obtener el tamaño de la pila usando size()
            int tamaño = pilaNumeros.size();
            System.out.println("Tamaño de la pila: " + tamaño);

            // Limpiar la pila usando clear()
            pilaNumeros.clear();
            System.out.println("Pila después de limpiar: " + pilaNumeros);
        }

        public static void miArrayListPilas () {
            System.out.println("Para mayor info revisa los comentarios en el código");
            // Crear una LinkedList para simular una pila de números
            LinkedList<Integer> pilaNumeros = new LinkedList<>();

            // Agregar elementos a la pila usando push() o addFirst()
            pilaNumeros.push(1);
            pilaNumeros.push(2);
            pilaNumeros.push(3);

            // Imprimir la pila de números
            System.out.println("Pila de números: " + pilaNumeros);

            // Obtener y eliminar el elemento superior de la pila usando pop() o removeFirst()
            int numeroEliminado = pilaNumeros.pop();
            System.out.println("Número eliminado de la pila: " + numeroEliminado);
            System.out.println("Pila después de eliminar el número: " + pilaNumeros);

            // Obtener el elemento superior de la pila sin eliminarlo usando peek() o getFirst()
            int numeroSuperior = pilaNumeros.peek();
            System.out.println("Número superior en la pila: " + numeroSuperior);
            System.out.println("Pila después de consultar el número superior: " + pilaNumeros);

            // Verificar si la pila está vacía usando isEmpty()
            boolean estaVacia = pilaNumeros.isEmpty();
            System.out.println("¿La pila está vacía? " + estaVacia);

            // Obtener el tamaño de la pila usando size()
            int tamaño = pilaNumeros.size();
            System.out.println("Tamaño de la pila: " + tamaño);

            // Limpiar la pila usando clear()
            pilaNumeros.clear();
            System.out.println("Pila después de limpiar: " + pilaNumeros);
        }

        public static void miSort() {
            int[] numeros = {5, 2, 9, 1, 7};

            // Antes de ordenar
            System.out.println("Arreglo antes de ordenar:");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
            System.out.println();

            // Ordenando el arreglo
            Arrays.sort(numeros);

            // Después de ordenar
            System.out.println("Arreglo después de ordenar:");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }

        public static void miBinarySearch() {
            int[] numeros = {1, 2, 4, 6, 8, 10, 12};
            int elementoABuscar = 6;

            // Antes de buscar
            System.out.println("Arreglo original:");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
            System.out.println();

            // Buscar el elemento
            int indice = Arrays.binarySearch(numeros, elementoABuscar);

            // Verificar si se encontró el elemento
            if (indice >= 0) {
                System.out.println("El elemento " + elementoABuscar + " está en el índice " + indice);
            } else {
                System.out.println("El elemento " + elementoABuscar + " no se encontró en el arreglo");
            }
        }

        public static void miEquals() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el tamaño de las matrices: ");
            int tamanio = scanner.nextInt();

            int[] matriz1 = new int[tamanio];
            int[] matriz2 = new int[tamanio];

            System.out.println("Ingrese los elementos de la primera matriz:");
            for (int i = 0; i < tamanio; i++) {
                matriz1[i] = scanner.nextInt();
            }

            System.out.println("Ingrese los elementos de la segunda matriz:");
            for (int i = 0; i < tamanio; i++) {
                matriz2[i] = scanner.nextInt();
            }

            boolean sonIguales = Arrays.equals(matriz1, matriz2);

            if (sonIguales) {
                System.out.println("Las matrices son iguales.");
                // Realizar operaciones adicionales si las matrices son iguales
            } else {
                System.out.println("Las matrices son diferentes.");
                // Realizar operaciones adicionales si las matrices son diferentes
            }

        }

        public static void miFill () {
            // Crear un arreglo de enteros
            int[] arreglo = new int[5];

            // Antes de llenar el arreglo
            System.out.println("Arreglo antes de llenar:");
            System.out.println(Arrays.toString(arreglo));

            // Llenar el arreglo con el valor 10
            Arrays.fill(arreglo, 10);

            // Después de llenar el arreglo
            System.out.println("Arreglo después de llenar:");
            System.out.println(Arrays.toString(arreglo));
        }

        public static void miCopyOf () {
            int[] original = {1, 2, 3};
            int[] copia = Arrays.copyOf(original, 5); // copia = [1, 2, 3, 0, 0]

            String[] palabras = {"hola", "mundo"};
            String[] copiaPalabras = Arrays.copyOf(palabras, 4); // copiaPalabras = ["hola", "mundo", null, null]
        }

        public static void miToString () {
            int[] numeros = {1, 2, 3};
            String cadena = Arrays.toString(numeros); // cadena = "[1, 2, 3]"

            String[] palabras = {"hola", "mundo"};
            String cadenaPalabras = Arrays.toString(palabras); // cadenaPalabras = "[hola, mundo]"
        }

        public static void miAsList () {
            // Crear un arreglo de strings
            String[] palabras = {"Hola", "Mundo", "Java"};

            // Convertir el arreglo en una lista
            List<String> lista = Arrays.asList(palabras);

            // Imprimir la lista
            System.out.println("Lista creada a partir del arreglo:");
            System.out.println(lista);

            // Modificar el arreglo original
            palabras[2] = "Programación";

            // Imprimir la lista nuevamente para ver los cambios
            System.out.println("Lista después de modificar el arreglo original:");
            System.out.println(lista);
        }

    }


