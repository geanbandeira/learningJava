import java.util.*;
import java.util.Scanner;

class Ginasta{
    private String numDoc;
    private Contato contato;
    
    public Ginasta(String numDoc){
        this.numDoc = numDoc;
    }
    
    public String getNumDoc(){
        return numDoc;
    }
    
    public void setNumDoc(String numDoc){
        this.numDoc = numDoc;
    }
    
    public Contato getContato(){
        return contato;
    }
    
    public void setContato(Contato contato){
        this.contato = contato;
    }
    
    public String toString(){
        return "\nNúmero do docuemnto: " + numDoc + "\n";
    }
}

class Contato{
    private String telefone;
    private String email;
    
    public Contato(String telefone, String email){
        this.telefone = telefone;
        this.email =email;
    }
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String toString(){
        return "\nTelefone: " + telefone + "\nEmail:" + email + "\n";
    }
}

public class Main{
    public static ArrayList<Ginasta> ginastas = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

        int opcao = 0;
        
        do{
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    cadastrarGinasta();
                    break;
                case 2:
                    listarGinastas();
                    break;
                case 3:
                    buscarGinasta();
                    break;
                case 4:
                    atualizarGinasta();
                    break;
                case 5:
                    deletarGinasta();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opçao Invalida. Tente novamente!");
            }
        }
    while(opcao != 0);
	}
	
	private static void mostrarMenu(){
	    System.out.println("1. Cadastrar Ginasta");
	    System.out.println("2. Listar Ginastas");
	    System.out.println("3. Buscar Ginasta");
	    System.out.println("4. Atualizar Ginasta");
	    System.out.println("5. Deletar Ginasta");
	    System.out.println("0. Sair");
	    System.out.println("[Escolha uma das opçoes]\n");
	}
	
	private static void cadastrarGinasta(){
	    System.out.println("Numero do documento: ");
	    String numDoc = scanner.nextLine();
	    
	    System.out.println("Telefone: ");
	    String telefone = scanner.nextLine();
	    System.out.println("Email: ");
	    String email = scanner.nextLine();
	    
	    Contato contato = new Contato(telefone, email);
	    System.out.println(contato);
	    
	    Ginasta ginasta = new Ginasta(numDoc);
	    ginastas.add(ginasta);
	    System.out.println("Ginasta cadastrado com sucesso");

	}
	
	private static void listarGinastas(){
	    System.out.println("Numero do documento: ");
	    String numDoc = scanner.nextLine();
	    
	    if(ginastas.isEmpty()){
	        System.out.println("Nenhum ginasta encontrado\n");
	    }else{
	        System.out.println("-- Lista de Ginastas --\n");
	        for(Ginasta ginasta : ginastas){
	            System.out.println(ginasta);
	        }
	    }
	}
	
	private static void buscarGinasta(){
	    System.out.println("Numero do documento: ");
	    String numDoc = scanner.nextLine();
	    
	    boolean encontrado = false;
	    for(Ginasta ginasta : ginastas){
	        if(ginasta.getNumDoc().equals(numDoc)){
	            System.out.println("Ginasta encontrado!");
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Ginasta nao encontrado\n");
	    }
	}
	
	private static void atualizarGinasta(){
	    System.out.println("Numero do documento: ");
	    String numDoc = scanner.nextLine();
	}
	
	private static void deletarGinasta(){
	    System.out.println("Numero do documento: ");
	    String numDoc = scanner.nextLine();
	    
	    boolean encontrado = false;
	    Iterator<Ginasta> iterator = ginastas.iterator();
	    while(iterator.hasNext()){
	        Ginasta ginasta = iterator.next();
	        if(ginasta.getNumDoc().equals(numDoc)){
	            iterator.remove();
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Ginasta nao encontrado\n");
	    }
	}
	
}










