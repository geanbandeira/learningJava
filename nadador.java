import java.util.Scanner;
import java.util.*;

class Nadador{
    private String idNadador;
    private String endereco;
    
    public Nadador(String idNadador, String endereco){
        this.idNadador = idNadador;
        this.endereco = endereco;
    }
    
    public String getIdNadador(){
        return idNadador;
    }
    
    public void setIdNadador(String idNadador){
        this.idNadador = idNadador;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;    
    }
    
    public String toString(){
        return "\nID Nadador: " + idNadador + "\nEndereço: \n" + endereco + "\n";
    }
}


public class Main{
    public static ArrayList<Nadador> nadadores = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

	    int opcao = 0;
	    
	    do{
	        mostrarMenu();
	        opcao = scanner.nextInt();
	        scanner.nextLine();
	        
	        switch(opcao){
                case 1:
                    cadastrarNadador();
                    break;
                case 2:
                    listarNadadores();
                    break;
                case 3:
                    buscarNadador();
                    break;
                case 4:
                    atualizarNadador();
                    break;
                case 5:
                    deletarNadador();
                    break;
                case 0:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opçao inválida, tente novamente");
	        }
	    }
	    while(opcao != 0);
	}
	
	private static void mostrarMenu(){
	    System.out.println("1. Cadastrar Nadador");
	    System.out.println("2. Listar Nadadores");
	    System.out.println("3. Buscar nadador");
	    System.out.println("4. Atualizar Nadador");
	    System.out.println("5. Deletar Nadador");
	    System.out.println("0. Sair");
	    System.out.println("[Escolha umas das Opçoes]");
	}
	
	private static void cadastrarNadador(){
	    System.out.println("ID do Nadador: ");
	    String idNadador = scanner.nextLine();
	    System.out.println("Endereço: ");
	    String endereco = scanner.nextLine();
	    
	    Nadador nadador = new Nadador(idNadador, endereco);
	    nadadores.add(nadador);
	    System.out.println("Nadador cadastrado com sucesso\n");
	}
	
	private static void listarNadadores(){
	    if(nadadores.isEmpty()){
	        System.out.println("Nenhum jogador encontrado\n");
	    }else{
	        System.out.println("-- Lista de Nadadores --\n");
	        for(Nadador nadador : nadadores){
	            System.out.println(nadador);
	            break;
	        }
	    }
	}
	
	private static void buscarNadador(){
	    System.out.println("ID do Nadador: ");
	    String idNadador = scanner.nextLine();
	    
	    boolean encontrado = false;
	    for(Nadador nadador : nadadores){
	        if(nadador.getIdNadador().equals(idNadador)){
	            System.out.println("Nadador encontrado com sucesso\n");
	            System.out.println(nadador);
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Nadador nao encontrado\n");
	    }
	}
	
	private static void atualizarNadador(){
	    System.out.println("ID do Nadador: ");
	    String idNadador = scanner.nextLine();
	    
	    Nadador nadadorEncontrado = null;
	    for(Nadador nadador : nadadores){
	        if(nadador.getIdNadador().equals(idNadador)){
	            nadadorEncontrado = nadador;
	            System.out.println("Nadador encontrado");
	            break;
	        }
	    }
	    if(nadadorEncontrado ==null ){
	        System.out.println("Nadador nao encontrado\n");
	        return;
	    }
	    
	    System.out.println("Novo Endereço: (Deixar em branco para manter o atual) \n");
	    String novoEndereco = scanner.nextLine();
	    if(!novoEndereco.isEmpty()){
	        nadadorEncontrado.setEndereco(novoEndereco);
	    }
	    System.out.println("Nadador atualizado com sucesso\n");
	}
	
	private static void deletarNadador(){
	    System.out.println("ID do Nadador: ");
	    String idNadador = scanner.nextLine();
	    
	    boolean encontrado = false;
	    Iterator<Nadador> iterator = nadadores.iterator();
	    while(iterator.hasNext()){
	        Nadador nadador = iterator.next();
	        if(nadador.getIdNadador().equals(idNadador)){
	            iterator.remove();
	            System.out.println("Nadador removido com sucesso\n");
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Nadador nao encontrado\n");
	    }
	}
}






