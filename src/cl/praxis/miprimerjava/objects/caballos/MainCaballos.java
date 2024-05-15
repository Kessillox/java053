package cl.praxis.miprimerjava.objects.caballos;

public class MainCaballos {
    public static void main(String[] args) {
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
