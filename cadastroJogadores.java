
import java.util.*;
import java.util.Scanner;

class Jogador{
    private String nome;
    private String id;
    private String clube;
    private String endereco;
    private String dataNascimento;
    
    public Jogador(String nome, String id, String clube, String endereco, String dataNascimento){
        this.nome = nome;
        this.id = id;
        this.clube = clube;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getId(){
        return id;
    }
    
    public String getClube(){
        return clube;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public String toString(){
        return "\nNome: \n" + nome + "\nID: \n" + id + "\nClube: \n" + clube + "\nEndereço: \n" + endereco + "\nData de Nascimento: \n"+ dataNascimento;
    }
}

public class Main{
    public static ArrayList<Jogador> jogadores = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	    int opcao = 0;
	    
	    do{
	        mostrarMenu();
	        opcao = scanner.nextInt();
	        scanner.nextLine();
	        
	        switch(opcao){
	            case 1:
	                cadastrarJogador();
	                break;
	            case 2:
	                listarJogadores();
	                break;
	            case 3:
	                buscarJogador();
	                break;
	            case 0:
	                System.out.println("Saindo...");
	            default:
	                System.out.println("Opção Inválida");
	        }
	    }while(opcao !=0);
}

    private static void mostrarMenu(){
        System.out.println("1. Cadastrar Jogador");
        System.out.println("2. Listar Jogadores");
        System.out.println("3. Buscar jogadores");
        System.out.println("0. Sair");
        System.out.println("Escolha uma das opções");
        
    }
    
    private static void cadastrarJogador(){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("ID: ");
        String id = scanner.nextLine();
        
        System.out.println("Clube: ");
        String clube = scanner.nextLine();
        
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        
        System.out.println("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        
        Jogador jogador = new Jogador(nome, id, clube, endereco, dataNascimento);
        jogadores.add(jogador);
        System.out.println("Jogador cadastrado com sucesso\n");
        
    }
    
    private static void listarJogadores(){
        if(jogadores.isEmpty()){
            System.out.println("Nenhum jogador encontrado");
        }else{
            for(Jogador jogador : jogadores){
                System.out.println("\n -- Lista de Jogadores --\n");
                System.out.println(jogador);
            }
        }
        
    }
    
    private static void buscarJogador(){
        System.out.println("Entre com ID do jogador");
        String id = scanner.nextLine();
        
            boolean encontrado = false;
            for(Jogador jogador : jogadores){
                if(jogador.getId().equals(id)){
                    System.out.println("\n -- Jogador Encontrado -- \n");
                    System.out.println(jogador);
                    encontrado = true;
                    break;
                }
        }
            
        if(!encontrado){
            System.out.println("Jogador não encontrado");
        }
    }
}
