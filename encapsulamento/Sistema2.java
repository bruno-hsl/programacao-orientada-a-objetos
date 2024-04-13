package encapsulamento;

public class Sistema2 {

    public static void main(String[] args){
        ContaCorrente c1 = new ContaCorrente(numeroConta:123);
        ContaCorrente c2 = new ContaCorrente(numeroConta:124);
        c2.numero = 125;
        c1.getSaldo();
    } 
    
}
