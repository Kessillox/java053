package cl.praxis.miprimerjava.exceptions;

public class Main {
    public static void main(String[] args) {
        //Division por 0 try catch
        /*try{
            int division = 10/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }*/

        /*****Division por 0 throw****/
        double numeroImprimir = division(10,0);
        System.out.println(numeroImprimir);
    }
    public static double division(int a, int b) {
//        if(b==0) {
//        throw new ArithmeticException("Division by zero");
//        }
        double division = a / b;
        return division;
    }
}
