package cl.praxis.miprimerjava.mainpolimorfismo;

import cl.praxis.miprimerjava.polimorfismo.Estudiante;
import cl.praxis.miprimerjava.polimorfismo.Persona;
import cl.praxis.miprimerjava.polimorfismo.Profesor;

import java.util.ArrayList;

public class MainPolimorfismo {
    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        ArrayList<Profesor> listaProfesores = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("Ion","Cucer",1,true, "masculino"));
        listaEstudiantes.add(new Estudiante("Carolina", "Lagos", 12, true, "no binario"));
        listaEstudiantes.add(new Estudiante("Nicolas", "Sanhueza", 20, false, "desconocido"));
        listaProfesores.add(new Profesor("Rodrigo", "González Lillo", 25, true, 20));
//        //Se asigna el tipo de objeto que vamos a recorrer de la lista
//        for (Estudiante estudiante : listaEstudiantes) {
//            if (!estudiante.isPresente()) {
//                System.out.println("Estudiante: " + estudiante);
//            }
//        }
//        for (Profesor profesor : listaProfesores) {
//            System.out.println("Profesor: " + profesor);
//        }
        ArrayList<Persona> listaPersonas = new ArrayList<>();
//        listaPersonas.add(new Estudiante("Ion","Cucer",1,true, "masculino"));
//        listaPersonas.add(new Estudiante("Carolina", "Lagos", 12, true, "no binario"));
//        listaPersonas.add(new Estudiante("Nicolas", "Sanhueza", 20, false, "desconocido"));
//        listaPersonas.add(new Profesor("Rodrigo", "González Lillo", 25, true, 20));
        listaPersonas.addAll(listaEstudiantes);
        listaPersonas.addAll(listaProfesores);
        for (Persona persona : listaPersonas) {
            if(persona instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) persona;
                System.out.println(estudiante.getIdentidadGenero());
            }else if(persona instanceof Profesor) {
                Profesor profesor = (Profesor) persona;
                System.out.println(profesor.getEdad());
            }
        }
    }
}
