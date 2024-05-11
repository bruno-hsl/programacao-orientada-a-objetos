package polimorfismo;

public class Animal {
    public void FazerSom(){
        System.out.println("cachorro latindo");
        FazerSom();
    }
    
}
