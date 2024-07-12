import java.util.Scanner;
import java.util.*;

class Cliente{
    private String nome;
    private String id;
    private String cpf;
    
    public Cliente(String nome, String id, String cpf){
        this.nome= nome;
        this.id = id;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getId(){
        return nome;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nID: " + id + "\nCPF: " + cpf;
    }
}

public class Bet{
    public static ArrayList <Cliente> clientes = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	    
	    int opcao = 0;
	    
	    do{
	        mostrarMenu();
	        opcao = scanner.nextInt();
	        scanner.nextLine();
	        
	        switch(opcao){
	            case 1:
	                cadastrarCliente();
	                break;
	            case 2:
	                listarClientes();
	                break;
	            case 3:
	                buscarCliente();
	                break;
	            case 4:
	                atualiarCliente();
	                break;
	            case 5:
	                deletarCliente();
	                break;
	            case 0:
	                System.out.println("Saindo...");
	            default:
	                System.out.println("Opçao Invalida. Tente novamente");
	        }
	    }while(opcao !=0 );
	}
	
	private static void mostrarMenu(){
        System.out.println("\n1. Cadastrar Cliente");
        System.out.println("2. Listar Clientes");
        System.out.println("3. Buscar Cliente");
        System.out.println("4. Atualizar Cliente");
        System.out.println("5. Deletar Cliente");
        System.out.println("Escolha uma das opçoes");
	}
	
	private static void cadastrarCliente(){
	    System.out.println("Nome: ");
	    String nome = scanner.nextLine();
	    System.out.println("ID: ");
	    String id = scanner.nextLine();
	    System.out.println("CPF: ");
	    String cpf = scanner.nextLine();
	    
	    Cliente cliente = new Cliente(nome, id, cpf);
	    clientes.add(cliente);
	    System.out.println("Cliente cadastrado com sucesso");
	}
	
	private static void listarClientes(){
	        if(clientes.isEmpty()){
	            System.out.println("Nenhum cliente cadastrado\n");
	        }else{
	            System.out.println("\n-- Lista de Clientes --\n");
	            for(Cliente cliente : clientes){
	            System.out.println(cliente);
	        }
	    }
	}
	
	private static void buscarCliente(){
	    System.out.println("Entre com o ID: ");
	    String id = scanner.nextLine();
	    
	    boolean encontrado = false;
	    for(Cliente cliente : clientes){
	        if(cliente.getId().equals(id)){
	            System.out.println("\nJogador encontrado\n");
	            System.out.println(cliente);
	            encontrado = true;
	            break;
	        }
	    }
	if(!encontrado){
	    System.out.println("Cliente nao encontrado");
    }    
}
	
	private static void atualiarCliente(){
	    System.out.println("ID do cliente: ");
	    String id = scanner.nextLine();
	    
	    Cliente clienteEcontrado = null;
	    for(Cliente cliente : clientes){
	        if(clientes.isEmpty()){
	        clienteEcontrado = cliente;
	        break;
	    } 
	}
	
	if(clienteEcontrado == null){
	    System.out.println("Cliente não encontrado");
	    return;
	}
	
	System.out.println("Novo nome: (Deixe em branco para manter o nome atual)");
	String novoNome = scanner.nextLine();
	if(!novoNome.isEmpty()){
	    clienteEcontrado.setNome(novoNome);
	}
}
	private static void deletarCliente(){
	    System.out.println("ID do Cliente: ");
	    String id = scanner.nextLine();
	    
	    boolean encontrado = false;
	    Iterator <Cliente> iterator = clientes.iterator();
	    while(iterator.hasNext()){
	        Cliente cliente = iterator.next();
	        if(cliente.getId().equals(id)){
	            iterator.remove();
	            System.out.println("\nCliente deletado com sucesso\n");
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("\nCliente não encontrado\n");
	    }
	}
}
