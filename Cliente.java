import java.util.Scanner;
import java.util.*;

class Cliente{
    private String nome;
    private String in;
    private String id;
    private String endereco;
    private String dataNascimento;

    public Cliente(String nome, String in, String id, String endereco, String dataNascimento){
        this.nome = nome;
        this.in = in;
        this.id = id;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getIn(){
        return in;
    }
    
    public void setIn(String in){
        this.in = in;
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
    
    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nIN: " + in + "\nID" + id + "\nEndereço: " + endereco + "\nData de nascimento: " + dataNascimento;
    }
}

public class Main{
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    
	    int opcao = 0;
	    
	    do{
	    mostrarMenu();
	    opcao = scanner.nextInt();
	    scanner.nextLine();
	    
	    switch(opcao){
	        case 1:
	            cadastrarCustomer();
	            break;
	        case 2:
	            listarCustomers();
	            break;
	        case 3:
	            buscarCustomer();
	            break;
	        case 4:
	            atualizarCustomer();
	            break;
	        case 5:
	            deletarCustomer();
	            break;
	        case 0:
	            System.out.println("Saindo...");
	            break;
	        default:
	            System.out.println("Opçao invalida, tente novamente");
	            break;
	    }
	}while(opcao != 0);
}
	
	private static void mostrarMenu(){
	    System.out.println("\n1. Cadastrar Cliente");
	    System.out.println("2. Listar Cliente");
	    System.out.println("3. Buscar Cliente");
	    System.out.println("4. Atualizar Cliente");
	    System.out.println("5. Deletar Cliente");
	    System.out.println("Escolha uma das Opçoes\n");
	}
	
	private static void cadastrarCustomer(){
	    System.out.println("Nome: ");
	    String nome = scanner.nextLine();
	    System.out.println("IN: ");
	    String in = scanner.nextLine();
	    System.out.println("ID: ");
	    String id = scanner.nextLine();
	    System.out.println("Endereço: ");
	    String endereco = scanner.nextLine();
	    System.out.println("Data de nascimento: ");
	    String dataNascimento = scanner.nextLine();
	    
	    Cliente cliente = new Cliente(nome, in, id, endereco, dataNascimento);
	    clientes.add(cliente);
	    System.out.println("Cliente cadastrado com sucesso");
	    
	}
	
	private static void listarCustomers(){
	        if(clientes.isEmpty()){
	            System.out.println("Nenhum cliente cadastrado");
	        }else{
	            System.out.println("\n-- Lista de clientes --\n");
	            for(Cliente cliente : clientes){
	                System.out.println(cliente);
	                break;
	            }
	        }
	}
	
	private static void buscarCustomer(){
	    System.out.println("IN: ");
	    String in = scanner.nextLine();
	    
	    boolean encontrado = false;
	    for(Cliente cliente : clientes){
	        if(cliente.getIn().equals(in)){
	            System.out.println(cliente);
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Nenhum cliente encontrado\n");
	    }
	}
	
	private static void atualizarCustomer(){
	    
	}
	
	private static void deletarCustomer(){
	    System.out.println("ID: ");
	    String id = scanner.nextLine();
	    
	    boolean encontrado = false;
	    Iterator <Cliente> iterator = clientes.iterator();
	    while(iterator.hasNext()){
	        Cliente cliente = iterator.next();
	        if(cliente.getId().equals(id)){
	            iterator.remove();
	            System.out.println("\nExcluido com sucesso\n");
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("\nCliente não encontrado\n");
	    }
    }
}

