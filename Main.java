package Aula2;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.numA = 2.8;
        calc.numB = 3.8;

        System.out.println("soma: " + calc.somar());
        System.out.println("multiplicar: " + calc.multiplicar());
        System.out.println("Subtrair: " + calc.subtrair() );
        System.out.println("Dividir: " + calc.subtrair());
    }

}
