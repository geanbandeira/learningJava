abstract class Animal{
    abstract void som();
    
    public void dormir(){
        System.out.println("mimindoo...");
    }
}

interface Alimentavel{
    void comer();
}

class Cachorro extends Animal implements Alimentavel{
    void som(){
        System.out.println("Latido");
    }
    public void comer(){
        System.out.println("Cachorro comendo...");
    }
}

public class Main
{
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		    cachorro.som();
		    cachorro.comer();
		    cachorro.dormir();
		}
}
