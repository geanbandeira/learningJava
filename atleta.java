import java.util.Scanner;
import java.util.*;

class Atleta{
    private String numDocumento;
    private String nacionalidade;
    private Contato contato;

    public Atleta(String numDocumento, String nacionalidade, Contato contato){
        this.numDocumento = numDocumento;
        this.nacionalidade = nacionalidade;
        this.contato = contato;
  }
  
    public String getNumDocumento(){
        return numDocumento;
    }
  
    public void setNumDocumento(String numDocumento){
        this.numDocumento = numDocumento;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    
    public Contato getContato(){
        return contato;
    }
    
    public void setContato(Contato contato){
        this.contato = contato;
    }
    
    public String toString(){
        return "\nNumero do documento: " + numDocumento + "\nNacionalidade: " + nacionalidade + "\n";
    }
}

class Contato{
    private String nome;
    private String telefone;
    private String email;
    
    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
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
        return "\nNome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email + "\n";
    }
}


public class Main{
    public static ArrayList<Atleta> atletas = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    
	    int opcao =0;
	    
	    do{
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    cadastrarAtleta();
                    break;
                case 2:
                    listarAtletas();
                    break;
                case 3:
                    buscarAtletas();
                    break;
                case 4:
                    atualizarAtleta();
                    break;
                case 5:
                    deletarAtleta();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opçao invalida. Tente novamente");
            }
	    }while(opcao != 0);
	}
	
	private static void mostrarMenu(){
	    System.out.println("1. Cadastrar Atleta");
	    System.out.println("2. Listar Atletas");
	    System.out.println("3. Buscar Atleta");
	    System.out.println("4. Atualizar Atleta");
	    System.out.println("5. Deletar Atleta");
	    System.out.println("0. Sair");
	}
	
	private static void cadastrarAtleta(){
	    System.out.println("Numero do documento: ");
	    String numDocumento = scanner.nextLine();
	    System.out.println("Nacionalidade: ");
	    String nacionalidade = scanner.nextLine();
	    
	    System.out.println("Nome: ");
	    String nome = scanner.nextLine();
	    System.out.println("Telefone: ");
	    String telefone = scanner.nextLine();
	    System.out.println("Email: ");
	    String email = scanner.nextLine();
	    
	    Contato contato = new Contato(nome, telefone, email);
	    
	    Atleta atleta = new Atleta(numDocumento, nacionalidade, contato);
	    atletas.add(atleta);
	    System.out.println("Atleta cadastrado com sucesso\n");
	    
	}
	
	private static void listarAtletas(){
	    if(atletas.isEmpty()){
	        System.out.println("Nenhum jogador encontrado\n");
	    }else{
	        System.out.println("-- Lista de Atletas --\n");
	        for(Atleta atleta : atletas){
	            System.out.println(atleta);
	            break;
	        }
	    }
	}
	
	private static void buscarAtletas(){
	    System.out.println("Numero do documento: ");
	    String numDocumento = scanner.nextLine();
	    
	    boolean encontrado = false;
	    for(Atleta atleta : atletas){
	        if(atleta.getNumDocumento().equals(numDocumento)){
	            System.out.println("Atleta encontrado com sucesso");
	            System.out.println(atleta);
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Atleta nao encontrado\n");
	    }
	}
	
	private static void atualizarAtleta(){
	    System.out.println("Numero do documento: ");
	    String numDocumento = scanner.nextLine();
	    
	    Atleta atletaEncontrado = null;
	    for(Atleta atleta : atletas){
	        if(atleta.getNumDocumento().equals(numDocumento)){
	            atletaEncontrado = atleta;
	            break;
	        }
	    }
	    
	    if(atletaEncontrado==null){
	        System.out.println("Atleta nao encontrado\n");
	        return;
	    }
	    
	    System.out.println("Novo Documento ()");
	    String novoNumDocumento = scanner.nextLine();
	    if(!novoNumDocumento.isEmpty()){
	        atletaEncontrado.setNumDocumento(novoNumDocumento);
	    }
	    System.out.println("Dados do atleta atualizado com sucesso\n");
	}
	
	private static void deletarAtleta(){
	    System.out.println("Numero do documento: ");
	    String numDocumento = scanner.nextLine();
	    
	    boolean encontrado = false;
	    Iterator<Atleta> iterator = atletas.iterator();
	    while(iterator.hasNext()){
	        Atleta atleta = iterator.next();
	        if(atleta.getNumDocumento().equals(numDocumento)){
	            iterator.remove();
	            System.out.println("Deletado com sucesso\n");
	            encontrado = true;
	            break;
	        }
	    }
	    if(!encontrado){
	        System.out.println("Atlata nao encontrado\n");
	    }
	}
}
