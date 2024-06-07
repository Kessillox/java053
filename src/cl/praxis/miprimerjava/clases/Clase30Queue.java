package cl.praxis.miprimerjava.clases;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Clase30Queue {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.add("D");
        cola.add("A");
        cola.add("C");
        cola.add("B");

        System.out.println("********Element*******");
        System.out.println(cola.element());

        System.out.println("Elementos de la Cola "+ cola.size());
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
        System.out.println("Elementos de la Cola "+ cola.size());
        System.out.println("**************** PriorityQueue ***********");
        Queue<String> cola2 = new PriorityQueue<>();
        cola2.add("D");
        cola2.add("A");
        cola2.add("C");
        cola2.add("B");


        System.out.println("********Peek*******");
        System.out.println(cola2.peek());

        System.out.println("Elementos de la Cola "+ cola2.size());
        while (!cola2.isEmpty()) {
            String element = cola2.poll();
            System.out.println(element);

        }
        System.out.println("Elementos de la Cola "+ cola2.size());



    }


}
