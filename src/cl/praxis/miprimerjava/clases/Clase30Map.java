package cl.praxis.miprimerjava.clases;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Clase30Map {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new HashMap<>();
        mapa.put("A", 1);
        mapa.put("B", 2);
        mapa.put("C", 3);
        mapa.put("D", 4);
        mapa.put("E", 5);
        System.out.println("mapa: " + mapa);
        System.out.println("Valos de B: "+mapa.get("B"));
        for(String clave : mapa.keySet()){
            System.out.println("clave = "+clave +" Valor = "+mapa.get(clave));
        }

        System.out.println("***************LinkedHashMap******************");
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("D", 4);
        linkedHashMap.put("A", 1);
        linkedHashMap.put("C", 3);
        linkedHashMap.put("B", 2);

        System.out.println(linkedHashMap);
        for(String clave : linkedHashMap.keySet()){
            System.out.println("clave = "+clave +" Valor = "+linkedHashMap.get(clave));
        }

        System.out.println("***************TreeMap******************");
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("D", 5);
        treeMap.put("B", 2);
        treeMap.put("A", 4);

        System.out.println(treeMap.keySet());
        for(String clave : treeMap.keySet()){
            System.out.println("clave = "+clave +" Valor = "+treeMap.get(clave));
        }



    }
}
