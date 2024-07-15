import java.util.Scanner;
import java.util.*;

class Torcedor{
    private String nome;
    private String id;
    private String endereco;
    
    public Torcedor(String nome, String id, String endereco){
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nID: " + id + "\nEndereço: " + endereco;
    }
    
}

public class Main{
    public static ArrayList<Torcedor> torcedores = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

        int opcao =0;
        
        do{
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    cadastrarTorcedor();
                    break;
                case 2:
                    listarTorcedor();
                    break;
                case 3:
                    buscarTorcedor();
                    break;
                case 4:
                    atualizarTorcedor();
                    break;
                case 5:
                    deletarTorcedor();
                    break;
                case 0:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opçao invalida, tente novamente.\n");
            }
        }while(opcao !=0);
	}
	
	private static void mostrarMenu(){
	    System.out.println("\n1. Cadastrar Torcedor");
	    System.out.println("2. Listar Torcedores");
	    System.out.println("3. Buscar Torcedor");
	    System.out.println("4. Atualizar Torcedor");
	    System.out.println("5. Deletar Torcedor");
	    System.out.println("0. Sair");
	    System.out.println("Escolha uma das Opçoes\n");
	}
	
	private static void cadastrarTorcedor(){
	    System.out.println("");
	    System.out.println("");
	    System.out.println("");
	    System.out.println("");
	    System.out.println("");
	}
	
}


