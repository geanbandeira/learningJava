
class Aviao{
    String nome;
    String companhia;
    int ano;
    
    void decolar(){
        System.out.println("O aviao está decolando");
    }
}

public class Main{
	public static void main(String[] args) {
	    
	    Aviao meuAviao = new Aviao();
	    meuAviao.nome = "Univerje";
	    meuAviao.companhia = "GalaUni";
	    meuAviao.ano = 2029;
	    meuAviao.decolar();
	    
	}
}
