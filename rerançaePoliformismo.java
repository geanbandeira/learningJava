class Animal{
    void barulho(){
        System.out.println("Animal fazendo barulho..");
    }
}

class Dog extends Animal{
    void barulho(){
        System.out.println("au! au!");
    }
}

class Passarinho extends Animal{
    void barulho(){
        System.out.println("pis pis");
    }
}

public class Main{
	public static void main(String[] args) {

        Passarinho meuPassarinho = new Passarinho();
        meuPassarinho.barulho();
        
        
        
	}
}
