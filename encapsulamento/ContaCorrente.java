package encapsulamento;

public class ContaCorrente {
    public int numero;
    private double saldo; 

    private ContaCorrente(){}

    public ContaCorrente(int numeroConta){
        this.numero = numeroConta;
        this.saldo = 0;
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int nueroConta){

    }
}


