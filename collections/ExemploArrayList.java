package collections;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Alice");
        nomes.add("Pedro");
        nomes.add("Julia");

        System.out.println(nomes.get(1));

        for (String nome : nomes){
            System.out.println(nome);
        }

        if(nomes.contains("pedro")){
            System.out.println("pedro esta na lista");
        }

        nomes.remove("Pedro");

        if(!nomes.contains("pedro")){
            System.out.println("pedro não esta na lista");
        }

        nomes.clear();
        if(nomes.isEmpty()){
            System.out.println("a lista esta vazia");
        }

    }
    
}
