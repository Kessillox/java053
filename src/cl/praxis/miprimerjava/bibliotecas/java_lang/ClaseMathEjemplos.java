package cl.praxis.miprimerjava.bibliotecas.java_lang;

public class ClaseMathEjemplos {
    public static void main(String[] args) {
        // Operaciones aritméticas básicas
        int suma = Math.addExact(5, 3); // 5 + 3 = 8
        int resta = Math.subtractExact(10, 4); // 10 - 4 = 6
        int producto = Math.multiplyExact(2, 6); // 2 * 6 = 12
        double division = 10.0 / 3.0; // División estándar, 10 / 3 = 3.33333...

        // Funciones trigonométricas
        double seno = Math.sin(Math.toRadians(30)); // Seno de 30 grados
        double coseno = Math.cos(Math.toRadians(60)); // Coseno de 60 grados
        double tangente = Math.tan(Math.toRadians(45)); // Tangente de 45 grados

        // Funciones exponenciales y logarítmicas
        double exponencial = Math.exp(2); // e^2
        double logaritmo = Math.log(10); // Logaritmo natural de 10
        double potencia = Math.pow(3, 4); // 3 elevado a la 4ta potencia
        double raizCuadrada = Math.sqrt(25); // Raíz cuadrada de 25

        // Funciones de redondeo
        double redondeoArriba = Math.ceil(3.14); // Redondeo hacia arriba de 3.14
        double redondeoAbajo = Math.floor(3.14); // Redondeo hacia abajo de 3.14
        long redondeo = Math.round(3.7); // Redondeo al entero más cercano de 3.7

        // Operaciones de comparación
        int maximo = Math.max(10, 20); // El máximo entre 10 y 20
        int minimo = Math.min(5, 8); // El mínimo entre 5 y 8

        // Imprimir resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("División: " + division);
        System.out.println("Seno: " + seno);
        System.out.println("Coseno: " + coseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Exponencial: " + exponencial);
        System.out.println("Logaritmo: " + logaritmo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Raíz Cuadrada: " + raizCuadrada);
        System.out.println("Redondeo Arriba: " + redondeoArriba);
        System.out.println("Redondeo Abajo: " + redondeoAbajo);
        System.out.println("Redondeo: " + redondeo);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
