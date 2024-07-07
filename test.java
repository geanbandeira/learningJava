import java.util.Scanner;
import java.util.*;

class Cidadao{
    private String nome;
    private String cpf;
    private String endereco;
    private String dataNascimento;
    
    public Cidadao(String nome, String cpf, String endereco, String dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public String toString(){
        return "\nNome: " + nome + "CPF: \n" + cpf + "Endereço: \n" + endereco + "Data de Nascimento: \n" + dataNascimento;
    }
    
}

public class Prefeitura{
    public static ArrayList<Cidadao> cidadaos = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    
	    int opcao = 0;
	    
	    do{
	        mostrarMenu();
	        opcao = scanner.nextInt();
	        scanner.nextLine();
	        
	        switch(opcao){
                case 1:
	                cadastrarCidadao();
	                break;
                case 2:
                    listarCidadaos();
                    break;
                case 3:
                    buscarCidadao();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida");
	        }
	    }while(opcao !=0);
	}
	
	public static void mostrarMenu(){
	    System.out.println("Sistema de Gerenciamento de Cidadãos");
	    System.out.println("1. Cadastrar Cidadão");
	    System.out.println("2. Listar Cidadãos");
	    System.out.println("3. Buscar Cidadão");
	    System.out.println("0. Sair");
	    System.out.println("Escolha uma das opções ");
}
    
    public static void cadastrarCidadao(){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        
        Cidadao cidadao = new Cidadao(nome, cpf, endereco, dataNascimento);
        cidadaos.add(cidadao);
        System.out.println("Cidadão cadastrado com sucesso");
    }
	
	
	public static void listarCidadaos(){
	    if(cidadaos.isEmpty()){
	        System.out.println("Cidadão não encontrado");
	    } else{
	        System.out.println("Lista de Cidadãos:\n");
	        for(Cidadao cidadao : cidadaos){
	            System.out.println(cidadao);
	        }
	    }
	}
	
	public static void buscarCidadao(){
	    System.out.println("Entre com o CPF");
	    String cpf = scanner.nextLine();
	    
	    boolean encontrado = false;
	    for(Cidadao cidadao : cidadaos){
	        if(cidadao.getCpf().equals(cpf)){
	            System.out.println("\nCidadão Encontrado\n");
	            System.out.println(cidadao);
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Cidadão não encontrado");
	    }
	}
}

