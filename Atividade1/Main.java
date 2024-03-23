package Atividade1;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.numA = 2;
        calc.numB = 3;

        System.out.println("soma: " + calc.somar());
        System.out.println("multiplicar: " + calc.multiplicar());
        System.out.println("Subtrair: " + calc.subtrair() );
        System.out.println("Dividir: " + calc.dividir());
        System.out.println("0: " + calc.verificarNumeroPrimo(0));
        System.out.println("1: " + calc.verificarNumeroPrimo(1));
        System.out.println("2: " + calc.verificarNumeroPrimo(2));
        System.out.println("3: " + calc.verificarNumeroPrimo(3));
        System.out.println("7: " + calc.verificarNumeroPrimo(7));
        System.out.println("83: " + calc.verificarNumeroPrimo(83));
        System.out.println("100: " + calc.verificarNumeroPrimo(100));
        System.out.println("991: " + calc.verificarNumeroPrimo(991));
        System.out.println("104729: " + calc.verificarNumeroPrimo(104729));
        System.out.println("14348907: " + calc.verificarNumeroPrimo(14348907));
    
    }

}
