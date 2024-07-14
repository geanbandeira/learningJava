import java.util.Scanner;
import java.util.*;

class Customer{
    private String nome;
    private String in;
    private String id;
    private String endereco;
    private String dataNascimento;

    public Customer(String nome, String in, String id, String endereco, String dataNascimento){
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
    
    public void setDataNascimento(){
        this.dataNascimento = dataNascimento;
    }
    
    public String toString(){
        return "Nome: " + nome + "IN: " + in + "ID" + id + "Endereço: " + endereco + "Data de nascimento: " + dataNascimento;
    }
}

public class Main{
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    
	    int opcao = 0;
	    
	    mostrarMenu();
	    opcao = scanner.nextInt();
	    scanner.nextLine();
	    
	    switch(opcao){
	        
	    }

	}
	
	private static void mostrarMenu(){
	    
	}
	
	private static void cadastrarCustomer(){
	    
	}
	
	private static void listarCustomers(){
	    
	}
	
	private static void buscarCustomer(){
	    
	}
	
	private static void atualizarCustomer(){
	    
	}
	
	private static void deletarCustomer(){
	    
	}
	
}




