package cl.praxis.miprimerjava.objects;

import java.util.List;

public class AutoConRuedas {
    //Atributos del Objeto
    private String modelo;
    private String marca;
    private String combustible;
    private String color;
    private String origen;
    private int anio;
    private boolean catalitico;
    private List<Rueda> ruedas;

    //Constructor Vacío
    public AutoConRuedas() {
    }

    //Constructor Completo

    public AutoConRuedas(String modelo, String marca, String combustible, String color, String origen, int anio, boolean catalitico, List<Rueda> ruedas) {
        this.modelo = modelo;
        this.marca = marca;
        this.combustible = combustible;
        this.color = color;
        this.origen = origen;
        this.anio = anio;
        this.catalitico = catalitico;
        this.ruedas = ruedas;
    }

    //getters and setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isCatalitico() {
        return catalitico;
    }

    public void setCatalitico(boolean catalitico) {
        this.catalitico = catalitico;
    }

    public List<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(List<Rueda> ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "AutoConRuedas{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", combustible='" + combustible + '\'' +
                ", color='" + color + '\'' +
                ", origen='" + origen + '\'' +
                ", anio=" + anio +
                ", catalitico=" + catalitico +
                ", ruedas=" + ruedas +
                '}';
    }
}
