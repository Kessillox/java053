package cl.praxis.miprimerjava.objects.oficina;

import java.util.List;

public class Oficina {
    //Objetos y Listas al final
    private int cantidadPuestos;
    private JefeProyecto jefeProyecto;
    private List<Programador> programadores;

    public Oficina() {
    }

    public Oficina(int cantidadPuestos, JefeProyecto jefeProyecto, List<Programador> programadores) {
        this.cantidadPuestos = cantidadPuestos;
        this.jefeProyecto = jefeProyecto;
        this.programadores = programadores;
    }

    public int getCantidadPuestos() {
        return cantidadPuestos;
    }

    public void setCantidadPuestos(int cantidadPuestos) {
        this.cantidadPuestos = cantidadPuestos;
    }

    public JefeProyecto getJefeProyecto() {
        return jefeProyecto;
    }

    public void setJefeProyecto(JefeProyecto jefeProyecto) {
        this.jefeProyecto = jefeProyecto;
    }

    public List<Programador> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(List<Programador> programadores) {
        this.programadores = programadores;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "cantidadPuestos=" + cantidadPuestos +
                ", jefeProyecto=" + jefeProyecto +
                ", programadores=" + programadores +
                '}';
    }

    public void saludoOficina(){
        System.out.println("Hola Mundo de la Oficina");
    }
}
