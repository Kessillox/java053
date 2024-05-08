package cl.praxis.miprimerjava.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Clase14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaAlumnos = new ArrayList<>();
        listaAlumnos.add("Matias");
        listaAlumnos.add("Francisco");
        listaAlumnos.add("Ion");
        listaAlumnos.add("Miguel");
        listaAlumnos.add("Rudi");
        System.out.println("Ingrese nombre alumno");
        String nombreAlumno = sc.nextLine();

        if(listaAlumnos.size() > 4){
            Collections.sort(listaAlumnos);
            Collections.reverse(listaAlumnos);

        }else if(listaAlumnos.size() < 4){
            if(!listaAlumnos.contains(nombreAlumno)){
                listaAlumnos.add(nombreAlumno);
            }else {
                System.out.println("ya existe el alumno... se voló y se agrego de nuevo");
            }
        }else {
            System.out.println("Ingrese numero del alumno a modificar");
            int numeroAlumno = sc.nextInt();
            listaAlumnos.set(numeroAlumno, nombreAlumno);
        }
        System.out.println(listaAlumnos);
        System.out.println(listaAlumnos.get(3));
    }
}

