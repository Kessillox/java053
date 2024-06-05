package cl.praxis.miprimerjava.objects.animales;

public class Gato extends Animal {
    private int cantidadPatas;

    public Gato (){
    }

    public Gato(String tipo,int cantidadPatas){
        super(tipo);
        this.cantidadPatas= cantidadPatas;
    }

    public int getCantidadPatas(){
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas){
        this.cantidadPatas= cantidadPatas;
    }

    @Override
    public void hacerSonido(){
        System.out.println("miau miau miau miuauu ");
    }

    @Override
    public String toString(){
        return "{" + super.toString() + "," + "cantidadPatas = " + cantidadPatas + "}";
    }
}
