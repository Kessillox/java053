package cl.praxis.miprimerjava.objects.animales;

import java.util.ArrayList;
import java.util.List;

public class MainAnimales {
    public static void main(String[] args) {
        Animal gato1 = new Gato("Mamifero", 4);
        Animal pajaro1 = new Pajaro("Dinosaurio", 2);
        Animal perro1 = new Perro("Canino", 4);
        Animal pez1 = new Pez("Pez", 2);

        List<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(gato1);
        listaAnimales.add(pajaro1);
        listaAnimales.add(perro1);
        listaAnimales.add(pez1);

        System.out.println("------------- Lista de animales ------------");
        System.out.println(listaAnimales);


        for (int i = 0; i < listaAnimales.size(); i++) {
            System.out.println(listaAnimales.get(i));
        }

        for(Animal animal : listaAnimales) {
            System.out.println(animal);
        }

        for(Animal animal : listaAnimales) {
            if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                System.out.println("El animal es: " + gato);
            }

            if (animal instanceof Pajaro) {
                Pajaro pajaro = (Pajaro) animal;
                System.out.println("El animal es: " + pajaro);
                pajaro.volar();
            }

            if (animal instanceof Perro) {
                Perro perro = (Perro) animal;
                System.out.println("El animal es: " + perro);
            }
            if (animal instanceof Pez) {
                Pez pez = (Pez) animal;
                System.out.println("El animal es: " + pez);
                pez.volar();
            }
        }

        Volador miVolador;

        miVolador = new Pajaro();
        miVolador.volar();

        miVolador = new Pez();
        miVolador.volar();
    }
}
