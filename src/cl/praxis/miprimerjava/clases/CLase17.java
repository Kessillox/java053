package cl.praxis.miprimerjava.clases;

import java.io.File;
import java.io.IOException;

public class CLase17 {
    /****** Método main ******/
    public static void main(String[] args) throws IOException {
        createDirectory("directory");
    }

    /***** Metodos Anexos ******/
    public static void createDirectory(String dir) throws IOException {
        File directory = new File("src/"+dir);
        if (!directory.exists()) {
            directory.mkdir();
        }else {
            System.out.println("directory already exists");
        }
    }

    /*Crear método para crear archivo*/
}
