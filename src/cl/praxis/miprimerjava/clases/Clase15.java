package cl.praxis.miprimerjava.clases;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clase15 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,4,8,5,5,10,2);
        List<Integer> numeros2 = new ArrayList<>();
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(3);
        numeros2.add(12);
        numeros2.add(5);
        numeros.stream().forEach(System.out::println);
        System.out.println(ANSI_CYAN+"******************************************************"+ANSI_RED);
        numeros2.stream().forEach(System.out::println);
    }
}
