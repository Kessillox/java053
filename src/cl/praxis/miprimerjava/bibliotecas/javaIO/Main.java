package cl.praxis.miprimerjava.bibliotecas.javaIO;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //metodo crear directorio
        System.out.println("Ingrese el nombre del directorio que desea crear");
        String nameDirectory = sc.nextLine();
        File directoryCreated = directoryCreator(nameDirectory);

        //metodo crear archivo
        System.out.println("Ingrese el nombre del archivo");
        String nameFile = sc.nextLine();
        File fileCreated = fileCreator(nameFile, directoryCreated);

        //Escribir en el archivo
        List<String> elements = new ArrayList<String>();
        String element;
        int option;

        do{
            System.out.println("-------------------------------");
            System.out.println("Ingresar un elemento presione 1");
            System.out.println("finalizar 2");
            option = sc.nextInt();
            sc.nextLine();

            if(option==1){
                System.out.println("ingrese un elemento");
                element = sc.nextLine();
                elements.add(element);
            }

        }while(option==1);

        writterFile(fileCreated,elements);

        //metodo leer archivo
        readerFile(fileCreated);

        //Metodo escritura PrintWritter
         printerFile(directoryCreated);
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

    public static File fileCreator(String nameFile, File directoryCreated){

        if(!nameFile.endsWith(".txt")){
            nameFile = nameFile+".txt";
        }

        File creatingFile = new File(directoryCreated,nameFile);

        try{
            if(!creatingFile.exists()) {
                if(creatingFile.createNewFile()){
                    System.out.println("Archivo creado exitosamente");
                }else{
                    System.out.println("Error al crear el archivo");
                }
            }else{
                System.out.println("El archivo existe");
            }
        }catch(IOException e){
            System.out.println("Error al crear el archivo"+e.getMessage());
        }

        return creatingFile;
    }
    public static void writterFile(File fileCreated, List<String> elements){
        String loadingLine = "-";
        char[] arrayChar  = {'A','P','O','L','O'};

        try(FileWriter newWriter = new FileWriter (fileCreated);
        BufferedWriter newBuffer = new BufferedWriter(newWriter)){
            System.out.println("--Escribiendo en el archivo--");
            for(String element : elements){
                //Escribe dentro del archivo
                newBuffer.write(element);
                //Realiza un salto de linea
                newBuffer.newLine();
                loadingLine += "-";
                System.out.println(loadingLine);
            }

            //Escritura de un array de caracteres en el archivo
            newBuffer.write(arrayChar,0,arrayChar.length);

            System.out.println("Escritura completada <|:{D");
        }catch (IOException e){
            System.out.println("Error al escribir en el archivo" + e.getMessage());
        }
    }
    public static void readerFile(File fileCreated){
        String element;

        try(FileReader newReader = new FileReader(fileCreated);
            BufferedReader newBufferedR = new BufferedReader(newReader)){
            System.out.println("---elementos en el archivo---");

            //Lectura del archivo
            while((element = newBufferedR.readLine())!=null){
                System.out.println(element);
            }

            //Lectura de un arreglo
            int value;
            List<String> newList = new ArrayList<String>();
            char [] arrayInteger = new char[1234];

            while((value = newBufferedR.read(arrayInteger,0,arrayInteger.length))!= -1){
                System.out.println("value");
            }
            
        }catch (IOException e){
            System.out.println("Error al Leer el archivo" + e.getMessage());
        }
    }
    
    public static void printerFile(File createdDirectory) {
        int value = 3;
        File newPrinterFile = new File(createdDirectory,"archivoPrinter.txt");

        //creacion de archivo nuevo
        try{
              if(newPrinterFile.createNewFile()){
                  System.out.println("el archivo se creo correctamente (printer)");
              }else{
                  System.out.println("el archivo no se creo");
              }
        }catch (IOException e){
            System.out.println("Error al crear el archivo"+e.getMessage());
        }

       //escritura con el metodo printf de la clase PrintWritter
        try (PrintWriter printer = new PrintWriter(newPrinterFile)) {
                 for(int i=0; i<10; i++){
                     printer.printf("Valor numero %d\n",i);
                 }
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo");
        }
    }
}
