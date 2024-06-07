package cl.praxis.miprimerjava.clases;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Clase30Set {
    public static void main(String[] args) {
        //creando e instanciado un Set, cómo
        Set<String> setLenguajes = new HashSet<>();
        setLenguajes.add("Java");
        setLenguajes.add(".Net");
        setLenguajes.add("Rust");
        setLenguajes.add("Python");
        setLenguajes.add("C++");
        //setLenguajes.add(null);

        System.out.println("*********************************");
        System.out.println(setLenguajes);

        Set<String> setLenguajes2 = new HashSet<>();
        setLenguajes2.add("Pascal");
        setLenguajes2.add("Kobol");

        System.out.println("*********************************");
        System.out.println(setLenguajes2);
        //[Java, C++, Rust, .Net, Pascal, Python, Kobol]

        setLenguajes.addAll(setLenguajes2);
        System.out.println("*********************************");
        System.out.println(setLenguajes);
        //[Java, C++, Rust, .Net, Pascal, Python, Kobol]
        System.out.println(setLenguajes.contains("Lua"));

        /******** LinkedHashSet **************/

        System.out.println("******** LinkedHashSet **************");

        Set<String> setLinkedHashSet = new LinkedHashSet<>();
        setLinkedHashSet.add("Andrea Jiménez");
        setLinkedHashSet.add("Ion Cucer");
        setLinkedHashSet.add("Ariel Sandoval");

        System.out.println("*********************************");
        System.out.println(setLinkedHashSet);

        Set<String> setLinkedHashSet2 = new LinkedHashSet<>();
        setLinkedHashSet2.add("Bastian Rojas");
        setLinkedHashSet2.add("Freddy Maldonado");
        setLinkedHashSet2.add("Franco Ortiz");

        System.out.println("*********************************");
        System.out.println(setLinkedHashSet2);

        setLinkedHashSet.addAll(setLinkedHashSet2);
        System.out.println("*********************************");
        System.out.println(setLinkedHashSet);

        setLinkedHashSet.addAll(setLinkedHashSet2);
        setLinkedHashSet.addAll(setLenguajes);

        System.out.println("*********************************");
        System.out.println(setLinkedHashSet);

        System.out.println("******** TreeSet **************");

        Set<String> setTreeSet = new TreeSet<>();
        setTreeSet.add("Andrea Jiménez");
        setTreeSet.add("Ion Cucer");
        setTreeSet.add("Ariel Sandoval");
        setTreeSet.add("Bastian Rojas");
        setTreeSet.add("Freddy Maldonado");

        System.out.println("*********************************");
        System.out.println(setTreeSet);

        Set<String> setTreeSet2 = new TreeSet<>();
        setTreeSet2.add("Bastian Rojas");
        setTreeSet2.add("Freddy Maldonado");
        setTreeSet2.add("Franco Ortiz");
        setTreeSet.retainAll(setTreeSet2);
        System.out.println("*****************RETAINS****************");
        System.out.println(setTreeSet);
        System.out.println("*********************************");
        System.out.println(setTreeSet2);

        setTreeSet.addAll(setTreeSet2);
        System.out.println("*********************************");
        System.out.println(setTreeSet);

        setTreeSet.addAll(setTreeSet2);
        setTreeSet.addAll(setLenguajes);
        setTreeSet.addAll(setLinkedHashSet);

        System.out.println("*********************************");
        System.out.println(setTreeSet);


    }
}
