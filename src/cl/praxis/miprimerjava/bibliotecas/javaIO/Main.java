package cl.praxis.miprimerjava.bibliotecas.javaIO;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //metodo crear fichero

        System.out.println("Ingrese el nombre el archivo que desea crear");
        String nameDirectory = sc.nextLine();
        File directoryCreated = directoryCreator(nameDirectory);

        //metodo crear archivo

        System.out.println("Ingrese el nombre del archivo");
        String nameFile = sc.nextLine();
        fileCreator(nameFile, directoryCreated);
        //metodo leer archivo
    }

    public static File directoryCreator (String nameDirectory){
        File creatingDirectory = new File("src/cl/praxis/miprimerjava/bibliotecas/javaIO/"+nameDirectory);
        try {
            if(!creatingDirectory.exists()){
                if(creatingDirectory.mkdir()){
                    System.out.println("Directorio creado correctamente");
                }else{
                    System.out.println("Problemas al crear el archivo");
                }
            }else{
                System.out.println("El directorio ya Existe");
            }
        }catch (RuntimeException e){
            System.out.println("Error creando el archivo"+e.getMessage());
        }
        return creatingDirectory;
    }

    public static void fileCreator(String nameFile, File directoryCreated){
        File creatingFile = new File(directoryCreated,nameFile);

    }
}
