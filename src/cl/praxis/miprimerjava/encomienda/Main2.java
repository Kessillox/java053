package cl.praxis.miprimerjava.encomienda;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, direccion, ciudad;
        int numDireccion, telefono;

        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el direccion: ");
        direccion = sc.nextLine();
        System.out.println("Ingrese el numero de Dirección: ");
        numDireccion = sc.nextInt();
        System.out.println("Ingrese el ciudad: ");
        ciudad = sc.nextLine();
        System.out.println("Ingrese el telefono: ");
        telefono = sc.nextInt();

        String etiqueta = String.format(
                "De:%s %s\n"
                +"Dirección:%s %d\n"
                +"Ciudad:%s\n"
                +"Contacto:%d\n",
                nombre, apellido, direccion,numDireccion, ciudad, telefono);
        System.out.println(etiqueta);


    }
}
