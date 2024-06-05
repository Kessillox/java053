package cl.praxis.miprimerjava.objects.animales;

public class Perro extends Animal{
    private int cantidadPatas;

    public Perro() {

    }

    public Perro(String tipo, int cantidadPatas) {
        super(tipo);
        this.cantidadPatas = cantidadPatas;
    }

    public int getCantidadPatas() { return cantidadPatas; }

    public void setCantidadPatas(int cantidadPatas) { this.cantidadPatas = cantidadPatas;}

    @Override
    public String toString() {
        return "{" + super.toString() + "," + "cantidadPatas=" + cantidadPatas + "}";
    }

    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }
}
