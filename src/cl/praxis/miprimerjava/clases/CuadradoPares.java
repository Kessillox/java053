package cl.praxis.miprimerjava.clases;

import java.util.List;
import java.util.stream.Collectors;

public class CuadradoPares {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        // Filtra números pares y calcula sus cuadrados.
        List<Integer> cuadrados = numeros.stream()
                .filter(n -> n % 2 == 0)  // Filtra pares.
                .map(n -> n * n)           // Calcula cuadrados.
                .collect(Collectors.toList());
        System.out.println(cuadrados);  // Salida: [4, 16]
    }
    /*filter(n -> n % 2 == 0) y map(n -> n * n) son operaciones encadenadas que filtran y transforman
    elementos del Stream, respectivamente
    El nombre de la variable la asigna el desarrollador podria ser n, a*/
}
