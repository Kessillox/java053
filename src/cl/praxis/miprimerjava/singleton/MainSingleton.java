package cl.praxis.miprimerjava.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Configurador.getInstancia();
        Configurador.getInstancia();
    }
}
