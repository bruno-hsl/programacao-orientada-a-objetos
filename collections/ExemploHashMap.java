package collections;
import java.util.HashMap;

public class ExemploHashMap {

    public static void main(String[] args) {
        
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("Brasil", "Brasila");
        capitais.put("franca", "Paris");
        capitais.put("Japao", "toquio");

        System.out.println(capitais.get("Brasil"));
        
        if(capitais.containsKey("franca")){
            System.out.println("franca esta com Hashmap");
        }

        for(String chave : capitais.keySet()){
            System.out.println(chave + " - " + capitais.get(chave));
        }
    }
    
}
