package exception;

import exception.banco.Banco;

public class Main {
    public static void main(String[] args) {
        
        Banco UCBank = new Banco();

        UCBank.abrirConta("conta1");

        try {
            UCBank.depositar("conta2", 10.0);
        
        } catch (Exception e) {
           System.out.println("algo deu");
        }

        
    }
}
