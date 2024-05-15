package cl.praxis.miprimerjava.objects.oficina;

import java.util.ArrayList;
import java.util.List;

public class MainOficina {
    public static void main(String[] args) {
        Oficina oficina = new Oficina();
        JefeProyecto jefe1 = new JefeProyecto("Francisco",17127377,2.00d,"Desarrollo");
        Programador programador1 = new Programador("Caroliz", 17789739,1.00d,"Desarrollo");
        Programador programador2 = new Programador("Basti", 1237681, 1.20d,"Desarrollo");
        Programador programador3 = new Programador("Ariel", 1237682, 1.20d,"Desarrollo");
        List<Programador> listaProgramador = new ArrayList<>();
        listaProgramador.add(programador1);
        listaProgramador.add(programador2);
        listaProgramador.add(programador3);
        oficina.setCantidadPuestos(3);
        oficina.setJefeProyecto(jefe1);
        oficina.setProgramadores(listaProgramador);
        System.out.println(oficina.getCantidadPuestos());
        System.out.println(oficina.getJefeProyecto());
        System.out.println(oficina.getProgramadores());
        System.out.println(oficina);
        oficina.saludoOficina();
    }
}
