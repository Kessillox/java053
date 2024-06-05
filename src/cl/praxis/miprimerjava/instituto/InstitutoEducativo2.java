package cl.praxis.miprimerjava.instituto;

public class InstitutoEducativo2 {
    private static InstitutoEducativo2 instancia;
    private InstitutoEducativo2() {
        try{
            Thread.sleep(4000);
            System.out.println("************************************");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static InstitutoEducativo2 getInstancia() {
        if (instancia == null) {
            synchronized (InstitutoEducativo2.class) {
                if (instancia == null) {
                    instancia = new InstitutoEducativo2();
                    System.out.println("Instancia inicializada");
                }
            }
        }
        System.out.println("LLamado a la instancia finalizado");
        return instancia;
    }
    public void mostrarMensaje(){
        System.out.println("Soy la única instancia de la clase InstitutoEducativo");
    }
}
