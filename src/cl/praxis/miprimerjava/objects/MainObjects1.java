package cl.praxis.miprimerjava.objects;

import java.util.ArrayList;
import java.util.List;

public class MainObjects1 {
    public static void main(java.lang.String[] args) {

        // Instancia de Auto
        AutoConRuedas auto = new AutoConRuedas();

        // Instancia de Ruedas 5 objetos
        Rueda rueda1 = new Rueda("Michelin",  15);
        rueda1.setModelo("nieve");
        Rueda rueda2 = new Rueda("Michelin", "nieve", 15);
        Rueda rueda3 = new Rueda("Michelin", "nieve", 15);
        Rueda rueda4 = new Rueda("Michelin", "nieve", 15);
        Rueda ruedaRepuesto = new Rueda("Michelin", "nieve", 15);

        // Lista con las ruedas
        List<Rueda> ruedas = new ArrayList<>();
        ruedas.add(rueda1);
        ruedas.add(rueda2);
        ruedas.add(rueda3);
        ruedas.add(rueda4);
        ruedas.add(ruedaRepuesto);

        // Seteo de atributos del auto
        auto.setAnio(2024);
        auto.setCatalitico(true);
        auto.setColor("Azul");
        auto.setCombustible("95 octanos");
        auto.setMarca("Ñuñuqui");
        auto.setModelo("spresso");
        auto.setOrigen("India");
        auto.setRuedas(ruedas);

        System.out.println(auto);

        //********************************** Caballos **********************************

        // Instancias de animales
        PuraSangre caballoPuraSangre = new PuraSangre("Caballo","12-12-2012","Caballo","Yegua");
        CuartoDeMilla caballoCuartoMilla = new CuartoDeMilla("caballo cuarto", "12-12-2012","caballo","caballa");
        Cebra cebra = new Cebra("Zebra");

        // Imprime los objetos creados
        System.out.println(caballoPuraSangre);
        System.out.println(caballoCuartoMilla);
        System.out.println(cebra);

        // Ejecutando los métodos implementados por la interface "Equino"
        caballoPuraSangre.hablar();
        cebra.hablar();
        System.out.println(caballoPuraSangre.relinchar(5));
        System.out.println(cebra.relinchar(10));



    }
}
