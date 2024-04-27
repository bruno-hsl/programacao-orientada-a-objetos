package heranca.empresa;

public class Diretor extends Funcionario{

    private String nome;
    private Integer cpf;
    private Integer telefone;
    private Double salario;
    private Integer qtdGerencias;

    private Diretor(){}
    
    public Diretor(String nome, Integer cpf, Integer telefone, Double salerio, Integer qtdGerencias) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salerio;
        this.qtdGerencias = qtdGerencias;
    }

    public Integer getQtdGerencias() {
        return this.qtdGerencias;
    }

    public void setQtdGerencias(Integer qtdGerencias) {
        this.qtdGerencias = qtdGerencias;
    }

    public Double getBonificacao(){
        return this.salario * 0.15;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", salario='" + getSalario() + "'" +
            ", qtdGerencias='" + getQtdGerencias() + "'" +
            ", qtdGerencias='" + getBonificacao() + "'" +
            "}";
    }

}
