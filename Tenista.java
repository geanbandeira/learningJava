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
	    System.out.println("1. Cadastrar tenista");
	    System.out.println("2. Listar tenistas");
	    System.out.println("3. Buscar tenista");
	    System.out.println("4. Atualizar tenista");
	    System.out.println("5. Deletar tenista");
	    System.out.println("0. Sair");
	    System.out.println("Escolha uma das opçoes");
	}
	
	private static void cadastrarTenista(){
	    System.out.println("Numero do Passaporte: ");
	    String passaporte = scanner.nextLine();
	    
	    System.out.println("Nome: ");
	    String nome = scanner.nextLine();
	    System.out.println("Endereço: ");
	    String endereco = scanner.nextLine();
	    System.out.println("Telefone: ");
	    String telefone = scanner.nextLine();
	    System.out.println("Email: ");
	    String email = scanner.nextLine();
	    
	    Contato contato = new Contato(nome, endereco, telefone, email);
	    
	    Tenista tenista = new Tenista(passaporte, contato);
	    tenistas.add(tenista);
	    System.out.println("Tenista cadastrado com sucesso\n");
	}
	
	private static void listarTenistas(){
	    if(tenistas.isEmpty()){
	        System.out.println("Nenhum tenista cadastrado\n");
	    }else{
	        System.out.println("-- Lista de Tenistas --");
	        for(Tenista tenista : tenistas){
	            System.out.println(tenista);
	            break;
	        }
	    }
	}
	
	private static void buscarTenista(){
	    System.out.println("Numero do Passaporte: ");
	    String passaporte = scanner.nextLine();
	    
	    boolean encontrado = false;
	    
	    for(Tenista tenista : tenistas){
	        if(tenista.getPassaporte().equals(passaporte)){
	            System.out.println("Tenista encontrado\n");
	            System.out.println(tenista);
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Tenista nao encontrado\n");
	    }
	}
	
	private static void atualizarTenista(){
	    System.out.println("Numero do passaporte: ");
	    String passaporte = scanner.nextLine();
	    
	    Tenista tenistaEncontrado = null;
	    for(Tenista tenista : tenistas){
	        if(tenista.getPassaporte().equals(passaporte)){
	            System.out.println("Tenista encontrado com sucesso");
	            tenistaEncontrado = tenista;
	        }
	    }
	    if(tenistaEncontrado == null){
	        System.out.println("Tenista nao encontrado\n");
	        return;
	    }
	    
	    System.out.println("Novo Endereço: (Deixar em branco para manter o atual)\n");
	    String novoEndereco = scanner.nextLine();
	    if(!novoEndereco.isEmpty()){
	        tenistaEncontrado.setPassaporte(novoEndereco);
	    }
	    System.out.println("Dados do tenista atualizado com sucesso\n");
	}
	
	private static void deletarTenista(){
	    System.out.println("Numero do passaporte: ");
	    String passaporte = scanner.nextLine();
	   
	    boolean encontrado = false;
	    Iterator<Tenista> iterator = tenistas.iterator();
	    while(iterator.hasNext()){
	        Tenista tenista = iterator.next();
	        if(tenista.getPassaporte().equals(passaporte)){
	            iterator.remove();
	            System.out.println("Tenista removido com sucesso\n");
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Tenista nao encontrado com sucesso\n");
	    
	}
	
}
}







