package heranca.empresa;

public class Sistema {

    public static void main(String[] args) {
        Engenheiro eng1 = new Engenheiro("joao", 123, 123, "crea1", "orientacao", 100000.0);
        Engenheiro eng2 = new Engenheiro("pedro", 124, 124, "crea2", "orientacao", 150000.0);

        Gerente ger1 = new Gerente("pr", 124, 124, 150000.0, 4);

        Diretor dire = new Diretor("Bruno", 077, 400, 300000.0, 6);

        System.out.println(eng1);
        System.out.println(eng2);
        System.out.println(ger1);
        System.out.println(dire);

    }
    
}
