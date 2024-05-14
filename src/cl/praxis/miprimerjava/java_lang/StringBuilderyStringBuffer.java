package cl.praxis.miprimerjava.java_lang;

public class StringBuilderyStringBuffer {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) {

        // Crear un objeto StringBuilder
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hola");

        // Agregar texto al final del StringBuilder
        sb.append(" Mundo");

        // Insertar texto en una posición específica
        sb.insert(4, " Java");

        // Mostrar el contenido del StringBuilder
        System.out.println(ANSI_BLUE + "Contenido después de append() e insert(): " + sb);

        // Eliminar caracteres en un rango de posiciones
        sb.delete(4, 9);

        // Mostrar el contenido del StringBuilder después de delete()
        System.out.println(ANSI_RED + "Contenido después de delete(): " + sb);

        // Eliminar un carácter en una posición específica
        sb.deleteCharAt(3);

        // Mostrar el contenido del StringBuilder después de deleteCharAt()
        System.out.println(ANSI_YELLOW + "Contenido después de deleteCharAt(): " + sb);

        // Reemplazar caracteres en un rango de posiciones con una cadena especificada
        sb.replace(0, 4, "Adiós");

        // Mostrar el contenido del StringBuilder después de replace()
        System.out.println(ANSI_BLUE + "Contenido después de replace(): " + sb);

        // Invertir la secuencia de caracteres
        sb.reverse();

        // Mostrar el contenido del StringBuilder después de reverse()
        System.out.println(ANSI_WHITE + "Contenido después de reverse(): " + sb);

        // Convertir el StringBuilder en una cadena
        String resultado = sb.toString();

        // Mostrar el resultado final
        System.out.println(ANSI_GREEN + "Resultado final: " + resultado);

        // Ejemplo de StringBuffer
        java.lang.StringBuilder stringBuffer = new java.lang.StringBuilder("Java");

        stringBuffer.append(" es");
        stringBuffer.insert(5, " un lenguaje de programación");
        stringBuffer.delete(15, 28);
        stringBuffer.deleteCharAt(4);
        stringBuffer.replace(10, 12, "un");
        // stringBuffer.reverse();

        String resultadoStringBuffer = stringBuffer.toString();

        System.out.println(ANSI_RED + "Usando StringBuffer: " + resultadoStringBuffer);
    }
}
