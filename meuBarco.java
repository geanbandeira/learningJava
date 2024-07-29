
class Barco{
    public String nome;
    public String modelo;
    public int ano;
    
    void pilotar(){
        System.out.println("Barco navegando...");
    }
}

public class Main{
	public static void main(String[] args) {

        Barco meuBarco = new Barco();
        meuBarco.nome = "PlanWar";
        meuBarco.modelo = "PlanHunter";
        meuBarco.ano = 2034;
        meuBarco.pilotar();

	}
}
