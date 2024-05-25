package exception.banco;

public class ContaCorrente {
    
    private String nome;
    private Double saldo;
    private String nomeConta;

    private ContaCorrente(){}

    public ContaCorrente(String nomeConta){
        this.nomeConta = nomeConta;
        this.saldo = 0.0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
