package cl.praxis.miprimerjava.objects.animales;

public class Animal {
    private String tipo;

    public Animal() {
    }

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}


