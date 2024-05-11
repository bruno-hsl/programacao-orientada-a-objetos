package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(3, 4);
        
    }

    Animal a1 = new Animal();
    a1.FazerSom();

    Cachorro c1.FazerSom();

    Carro c2 = new Carro();
    Moto m2 = new Moto();
    acelerarVeiculo(c2);
    acelerarVeiculo(m2);
    

public static void acelerarVeiculo(Carro v){
    v.acelerar();
}
}
