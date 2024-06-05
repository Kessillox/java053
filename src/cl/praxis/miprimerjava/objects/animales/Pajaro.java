package cl.praxis.miprimerjava.objects.animales;

public class Pajaro extends Animal implements Volador{
    private int cantidadPatas;

    public Pajaro() {
        super();
        cantidadPatas = 0;
    }
    
    public Pajaro(String tipo, int cantidadPatas) {
        super(tipo);
        this.cantidadPatas = cantidadPatas;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    @Override
    public void hacerSonido(){
        System.out.println("Trinar o Piar");
    }

    @Override
    public String toString() {
        return "{" + super.toString() + ", Tipo = " + getTipo() + ", Cantidad de Patas = " + Integer.toString(getCantidadPatas()) + "}";
    }

    @Override
    public void volar() {
        System.out.println("el pajaro vuela");
    }
}
