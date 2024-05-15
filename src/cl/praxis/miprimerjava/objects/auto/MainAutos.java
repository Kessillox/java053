package cl.praxis.miprimerjava.objects.auto;

import java.util.ArrayList;
import java.util.List;

public class MainAutos {
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
    }
}
