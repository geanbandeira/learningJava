import java.util.*;
import java.util.Scanner;

    class Apostador{
        private String nome;
        private String id;

    public Apostador(String nome, String id){
        this.nome = nome;
        this.id = id;
        
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
    
    public String toString(){
        return "\nNome: " + nome + "\nID: \n" + id;
    }
}

public class Main{
    public static ArrayList<Apostador> apostadores = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

        int opcao =0;
        
        do{
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    cadastrarApostador();
                    break;
                case 2:
                    listarApostadores();
                    break;
                case 3:
                    buscarApostador();
                    break;
                case 4:
                    atualizarApostador();
                    break;
                case 5:
                    deletarApostador();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opçao invalida, tente novamente\n");
            }
        }
        while(opcao != 0);
	}
	
	private static void mostrarMenu(){
	    System.out.println("1. Cadastrar Apostador");
	    System.out.println("2. Listar Apostadores");
	    System.out.println("3. Buscar Apostador");
	    System.out.println("4. Atualizar Apostador");
	    System.out.println("5. Deletar Apostador");
	    System.out.println("Escolha uma das opçoes\n");
	}
	
	private static void cadastrarApostador(){
	    System.out.println("Nome: ");
	    String nome =scanner.nextLine();
	    System.out.println("ID: ");
	    String id = scanner.nextLine();
	    
	    Apostador apostador = new Apostador(nome, id);
	    apostadores.add(apostador);
	    System.out.println("Apostador cadastrado com sucesso\n");
	}
	
	public static void listarApostadores(){
	    if(apostadores.isEmpty()){
	        System.out.println("Nenhum jogador encontrado\n");
	    }else{
	        System.out.println("-- Lista de Apostadores --\n");
	        for(Apostador apostador : apostadores){
	            System.out.println(apostador);
	            break;
	        }
	    }
	}
	
	public static void buscarApostador(){
	    System.out.println("ID: ");
	    String id = scanner.nextLine();
	    
	    boolean encontrado = false;
	    for(Apostador apostador : apostadores){
	        if(apostador.getId().equals(id)){
	            System.out.println("Apostador Encontrado\n");
	            System.out.println(apostador);
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Apostador nao encontrado\n");
	    }
	}
	
	public static void atualizarApostador(){
	    System.out.println("ID: ");
	    String id = scanner.nextLine();
	    
	    Apostador apostadorEncontrado = null;
	    for(Apostador apostador : apostadores){
	        if(apostador.getId().equals(id)){
	            apostadorEncontrado = apostador;
	            break;
	        }
	    }
	    if(apostadorEncontrado == null){
	        System.out.println("Apostador nao encontrado\n");
	        return;
	    }
	    
	    System.out.println("Novo Nome ()");
	    String novoNome = scanner.nextLine();
	    if(!novoNome.isEmpty()){
	        apostadorEncontrado.setNome(novoNome);
	    }
	    System.out.println("Dados atualizado com sucesso\n");
	}
	
	private static void deletarApostador(){
	    System.out.println("ID: ");
	    String id = scanner.nextLine();
	    
	    boolean encontrado = false;
	    Iterator <Apostador> iterator = apostadores.iterator();
	    while(iterator.hasNext()){
	        Apostador apostador = iterator.next();
	        if(apostador.getId().equals(id)){
	            iterator.remove();
	            System.out.println("Removido com sucesso\n");
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Não encontrado\n");
	    }
	}
	
}

