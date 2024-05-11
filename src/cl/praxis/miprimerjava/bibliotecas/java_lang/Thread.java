package cl.praxis.miprimerjava.bibliotecas.java_lang;

public class Thread {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) throws InterruptedException {
        // Creamos un objeto de la clase MiHilo
        MiHilo hilo = new MiHilo();

        // Iniciamos el hilo
        hilo.start();

        // Mostramos un mensaje desde el hilo principal
        System.out.println(ANSI_RED + "Hilo principal: Esperando que el hilo termine.");

        // Esperamos a que el hilo termine su ejecución

            hilo.join();


        // Mostramos un mensaje después de que el hilo termina su ejecución
        System.out.println(ANSI_BLUE + "Hilo principal: El hilo ha terminado.");
    }
}

// Creamos una clase que extiende Thread
class MiHilo extends java.lang.Thread {
    // Sobreescribimos el método run() de la clase Thread
    public void run() {
        // Código que se ejecutará en el hilo
        System.out.println("Hilo secundario: Iniciando ejecución.");

        // Simulamos una tarea que lleva tiempo
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo secundario: Contando " + i);
            try {
                java.lang.Thread.sleep(1000); // Espera de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Hilo secundario: El hilo ha sido interrumpido.");
            }
        }

        System.out.println("Hilo secundario: Finalizando ejecución.");
    }
}
