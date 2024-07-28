import java.util.Scanner;
import java.util.*;

class Tenista{
    private String passaporte;
    private Contato contato;
    
    public Tenista(String passaporte, Contato contato){
        this.passaporte = passaporte;
    }
    
    public String getPassaporte(){
        return passaporte;
    }
    
    public void setPassaporte(String passaporte){
        this.passaporte = passaporte;
    }
    
    public Contato getContato(){
        return contato;
    }
    
    public void setContato(){
        this.contato = contato;
    }
    
    public String toString(){
        return "\nPassaporte: " + passaporte + "\n";
    }
}

class Contato{
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    
    public Contato(String nome, String endereco, String telefone, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(){
        this.telefone = telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nEmail: " + email + "\n";
    }
}

public class Main{
    public static ArrayList<Tenista> tenistas = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    
	    int opcao = 0;
	    
	    do{
	        mostrarMenu();
	        opcao = scanner.nextInt();
	        scanner.nextLine();
	        
	        switch(opcao){
                case 1:
                    cadastrarTenista();
                    break;
                case 2:
                    listarTenistas();
                    break;
                case 3:
                    buscarTenista();
                    break;
                case 4:
                    atualizarTenista();
                    break;
                case 5:
                    deletarTenista();
                    break;
                case 0:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Opçao Invalida. tente novamente!");
	        }
	    }
	    while(opcao!= 0);
	}
	
	private static void mostrarMenu(){
	    System.out.println("");
	}
	
	private static void cadastrarTenista(){
	    
	}
	
	private static void listarTenistas(){
	    
	}
	
	private static void buscarTenista(){
	    
	}
	
	private static void atualizarTenista(){
	    
	}
	
	private static void deletarTenista(){
	    
	}
	
}












