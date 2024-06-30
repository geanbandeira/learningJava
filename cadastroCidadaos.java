import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Cidadao{
    private String nome;
    private int idade;
    private String endereco;

    public Cidadao(String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    @Override
    public String toString(){
        return "Nome: " + nome + ", Idade: " + idade + ", Endereco" + endereco;
    }
}

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List <Cidadao> cidadaos = new ArrayList<>();
		
	    System.out.println("Sistema - Cadastro de Cidadãos");
	    
	    while(true){
	        System.out.println("1. Adicionar cidadão");
	        System.out.println("2. Listar Cidadãos");
	        System.out.println("3. Sair");
	        System.out.println("Escolha uma opção: ");
	        int opcao = scanner.nextInt();
	        scanner.nextInt();

            if(opcao == 1){
                System.out.println("Nome: ");
                String nome = scanner.nextLine();
                System.out.println("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Endereco: ");
                String endereco = scanner.nextLine();
                
                cidadaos.add(new Cidadao(nome, idade, endereco));
            } else if( opcao ==2){
                for(Cidadao cidadao : cidadaos){
                    System.out.println(cidadao);
                }
            } else if(opcao ==3){
                break;
            } else{
                System.out.println("Opção Invalida");
            }
	    }
	    scanner.close();
	}
}

