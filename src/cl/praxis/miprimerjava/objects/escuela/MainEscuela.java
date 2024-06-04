package cl.praxis.miprimerjava.objects.escuela;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainEscuela {
    public static void main(String[] args) {
        /********Instancias de Estudiantes********/
        Estudiante estudiante1 = new Estudiante("Sofía", "Egaña",  LocalDate.of(1999, 9, 25), 1999999,  "blanco", LocalDate.of(2024, 3, 12), LocalDate.of(2024, 6, 15));
        Estudiante estudiante2 = new Estudiante("Eddie", "Gato", LocalDate.of(2021,5,5), 20123123, "amarillo", LocalDate.of(2024, 3, 12), LocalDate.of(2024, 3, 12));
        Estudiante estudiante3 = new Estudiante("Matheo","Montenegro",LocalDate.of(2000,12,24),26543654,"Blanco",LocalDate.of(2020,1,20),LocalDate.of(2022,9,11));
        Estudiante estudiante4= new Estudiante("Lucas","Pinto",LocalDate.of(2009,10,15 ),22140845, "Cafe",LocalDate.of(2021,5,12),LocalDate.of(2023,7,23) );
        Estudiante estudiante5 = new Estudiante("Obi Wan", "Kenobi", LocalDate.of(1356, 8, 5), 154687542, "Verde", LocalDate.of(2021, 3, 12), LocalDate.of(2023, 2, 6));
        Estudiante estudiante6 = new Estudiante("Patricio", "Muñoz", LocalDate.of(2000,11,13),201405044, "Rojo", LocalDate.of(2021,5,13), LocalDate.of(2020,9,13));
        Estudiante estudiante7 = new Estudiante("Lola", "Montero", LocalDate.of(2005, 9, 23), 21095832, "Naranjo", LocalDate.of(2021, 3, 1), LocalDate.of(2022, 12, 15));
        Estudiante estudiante8 = new Estudiante("Elsa", "Pito", LocalDate.of(2016, 5, 9), 12345322, "Amarillo", LocalDate.of(2005,11,6), LocalDate.of(2017,4,4));
        Estudiante estudiante9 = new Estudiante("Ion", "Cucer", LocalDate.of(2015,5,3), 25305647, "azul", LocalDate.of(2021,5,12), LocalDate.of(2021,5,12));

        /******Instructores******/
        Instructor instructor1 = new Instructor("Pedro", "López", LocalDate.of(1975, 2, 20), 11223344, "Avanzado");
        Instructor instructor2 = new Instructor("Daniel","Aguilar",LocalDate.of(1980,9,14),12876345,"Hanshi");
        Instructor instructor3 = new Instructor("Zakarías", "Bello Delano", LocalDate.of(1859, 7, 24), 184585654, "Negro");

        /**********Apoderado***********/
        Apoderado apoderado1 = new Apoderado ("Alan", "Brito", LocalDate.of(1996, 6, 11), 25000123, 30000, 50000);
        Apoderado apoderado2 = new Apoderado("Juan", "Pérez", LocalDate.of(1980, 5, 15), 15685372, 15000, 100000);
        Apoderado apoderado3 = new Apoderado("Andrea", "Jiménez", LocalDate.of(1975, 7, 28), 9999999, 30000, 50000);
        Apoderado apoderado4 = new Apoderado("Natalia", "Cucer", LocalDate.of(1951, 2, 5), 19003257, 30247, 45000);

        /********Persona********/
        Persona instructor4 = new Instructor("Felipe", "Kessi", LocalDate.of(1990,10,19),17214085,"Junior");
        Persona apoderado5 = new Apoderado("Patricia", "Bustos", LocalDate.of(1965,06,29), 981273, 35000, 20000);
        Persona estudiante10 = new Estudiante("Joaquin", "Kessi", LocalDate.of(2012,3, 27), 2343423, "blanco", LocalDate.of(2020,1,20),LocalDate.of(2022,9,11));

        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(instructor1);
        listaPersonas.add(instructor2);
        listaPersonas.add(instructor3);
        listaPersonas.add(instructor4);
        listaPersonas.add(apoderado1);
        listaPersonas.add(apoderado2);
        listaPersonas.add(apoderado3);
        listaPersonas.add(apoderado4);
        listaPersonas.add(apoderado5);
        listaPersonas.add(estudiante10);
        listaPersonas.add(estudiante1);
        listaPersonas.add(estudiante2);
        listaPersonas.add(estudiante3);
        listaPersonas.add(estudiante4);

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);
        listaEstudiantes.add(estudiante5);
        listaEstudiantes.add(estudiante6);
        listaEstudiantes.add(estudiante7);
        listaEstudiantes.add(estudiante8);
        listaEstudiantes.add(estudiante9);

        List<Instructor> listaInstructores = new ArrayList<>();
        listaInstructores.add(instructor1);
        listaInstructores.add(instructor2);
        listaInstructores.add(instructor3);

        System.out.println("*****************Lista Instructores**********");
        System.out.println(listaInstructores);
        System.out.println("*****************Lista Estudiantes**********");
        System.out.println(listaEstudiantes);
        System.out.println("*****************Lista Personas**********");
        System.out.println(listaPersonas);

    }
}
