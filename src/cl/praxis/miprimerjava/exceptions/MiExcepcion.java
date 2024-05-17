package cl.praxis.miprimerjava.exceptions;

public class MiExcepcion extends Exception {
    //Constructor
    public MiExcepcion(String message) {
        super(message);
    }

    //Metodo personalizado
    public String validoNulo(String arg){
        String mensaje = "";
        if(arg == null){
            mensaje = "Elemento nulo";
        }
        return mensaje;
    }


}
