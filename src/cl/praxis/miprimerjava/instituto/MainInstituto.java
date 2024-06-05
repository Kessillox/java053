package cl.praxis.miprimerjava.instituto;

public class MainInstituto {
    public static void main(String[] args) {
        //Se instancia a la Interface Runnable para encapsular la tarea que se puede ejecutar como un hilo
        Runnable tarea = () -> {
            InstitutoEducativo2 objInstitutoEducativo = InstitutoEducativo2.getInstancia();
            objInstitutoEducativo.mostrarMensaje();
        };
        //Se crean los hilos de tareas que van a obtener la instancia

        Thread hilo1 = new Thread(tarea);
        System.out.println("************************************");
        Thread hilo2 = new Thread(tarea);
        System.out.println("************************************");
        Thread hilo3 = new Thread(tarea);
        System.out.println("************************************");

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
