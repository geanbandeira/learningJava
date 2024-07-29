
class Carro{
        String nome;
        String modelo;
        int ano;
        
        void dirigir(){
            System.out.println("O carro está andando");
        }
    }

public class Main{
	public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.nome = "Ferrari";
        meuCarro.modelo = "Ferr";
        meuCarro.ano = 2016;
        meuCarro.dirigir();
        
        
	}
}
