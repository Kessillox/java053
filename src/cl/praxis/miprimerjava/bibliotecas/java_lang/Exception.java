package cl.praxis.miprimerjava.bibliotecas.java_lang;

public class Exception extends Throwable {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        try {
            // Llamamos a un método que puede lanzar una excepción
            dividir(10, 0);
        } catch (ArithmeticException e) {
            // Capturamos la excepción específica ArithmeticException
            System.out.println(ANSI_BLUE + "No se puede dividir por cero.");
        } finally {
            // El bloque finally se ejecuta siempre, se ejecute o no una excepción
            System.out.println(ANSI_BLUE + "Bloque finally ejecutado.");
        }

        // Ejemplo de RuntimeException
        try {
            // Lanzamos una excepción RuntimeException
            throw new RuntimeException(ANSI_GREEN + "Este es un RuntimeException.");
        } catch (RuntimeException e) {
            // Capturamos la excepción RuntimeException
            System.out.println(ANSI_GREEN + "Se ha producido un RuntimeException: " + e.getMessage());
        }
    }

    // Método que puede lanzar una excepción
    public static void dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException(ANSI_RED + "Intento de dividir por cero.");
        } else {
            int resultado = a / b;
            System.out.println(ANSI_RED + "El resultado de la división es: " + resultado);
        }
    }
}