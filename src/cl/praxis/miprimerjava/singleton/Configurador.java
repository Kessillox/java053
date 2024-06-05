package cl.praxis.miprimerjava.singleton;

public class Configurador {
    //Variable encapsulada y estática
    private static Configurador objConfigurador;
    //Constructor Vacío
    private Configurador() {}

    public static Configurador getInstancia() {

        if (objConfigurador == null) {
            synchronized (Configurador.class) {
                if (objConfigurador == null) {
                    objConfigurador = new Configurador();
                    System.out.println("instancia creada");
                }
            }

        }
        System.out.println("Llamada a la Instancia del Configurador");
        return objConfigurador;
    }

}
