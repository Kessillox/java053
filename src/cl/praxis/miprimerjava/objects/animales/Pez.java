package cl.praxis.miprimerjava.objects.animales;

public class Pez extends Animal implements Volador{
    private int velocidade;

    public Pez() {
    }

    public Pez(int velocidade) {
        this.velocidade = velocidade;
    }

    public Pez(String tipo, int velocidade) {
        super(tipo);
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Pez{" +
                "velocidade=" + velocidade +
                "} " + super.toString();
    }

    @Override
    public void volar() {
        System.out.println("el pez vuela porque es volador");
    }
}
