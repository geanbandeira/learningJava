import java.util.Scanner;
import java.util.*;

class Estudante{
    private String nome;
    private String id;
    private String curso;
    private String dataNascimento;
    private String endereco;
    
    public Estudante(String nome, String id, String curso, String dataNascimento, String endereco){
        this.nome = nome;
        this.id = id;
        this.curso = curso;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
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

    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
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
    
    @Override
    public String toString(){
        return "\nNome: " + nome + "\nID: " + id + "\nCurso: " +curso+ "\nEndereco: " + endereco + "\nData de Nascimento: " +dataNascimento;
    }
}

public class Main{
    public static ArrayList<Estudante> estudantes = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
 	public static void main(String[] args) {

    int opcao = 0;
    
    do{
        mostrarMenu();
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch(opcao){
            case 1:
                cadastrarEstudante();
                break;
            case 2:
                listarEstudantes();
                break;
            case 3:
                buscarEstudante();
                break;
            case 4:
                atualizarEstudante();
            case 5:
                deletarEstudante();
            case 0:
                System.out.println("Saindo...");
            default:
                System.out.println("Opcao inválida. Tente novamente");
        }
    }while(opcao != 0);
}
	
	private static void mostrarMenu(){
	    System.out.println("1. Cadastrar Estudante");
	    System.out.println("2. Listar Estudantes");
	    System.out.println("3. Buscar Estudante");
	    System.out.println("4. Atualizar Estudante");
	    System.out.println("5. Deletar Estudante");
	    System.out.println("0. Sair ");
	    System.out.println("Escolha uma das opçoes");
	    
	}
	
	private static void cadastrarEstudante(){
	    System.out.println("Nome: ");
	    String nome = scanner.nextLine();
	    System.out.println("ID: ");
	    String id = scanner.nextLine();
	    System.out.println("Curso: ");
	    String curso = scanner.nextLine();
	    System.out.println("Endereço: ");
	    String endereco = scanner.nextLine();
	    System.out.println("Data de Nascimento:");
	    String dataNascimento = scanner.nextLine();
	    
	    Estudante estudante = new Estudante(nome, id, curso, endereco, dataNascimento);
	    estudantes.add(estudante);
	    System.out.println("Estudante cadastrado com sucesso!\n");
	}
	
	private static void listarEstudantes(){
	    if(estudantes.isEmpty()){
	        System.out.println("Nenhum estudante encontrado");
	    } else{
	        for(Estudante estudante : estudantes){
	            System.out.println("-- Lista de Estudantes --");
	            System.out.println(estudante);
	            break;
	        }
	    }
	    
	}
	
	private static void buscarEstudante(){
	    System.out.println("ID do estudante: ");
	    String id = scanner.nextLine();
	    
	    boolean encontrado = false;
	    for(Estudante estudante : estudantes){
	        if(estudante.getId().equals(id)){
	            System.out.println("\nEstudante encontrado!");
	            System.out.println(estudante);
	            encontrado = true;
	            break;
	        
	        }
	    }if(!encontrado){
	        System.out.println("\nEstudante nao encontrado!");
	    }
	}
	
	private static void atualizarEstudante(){
	    System.out.println("Id do estudante: ");
	    String id = scanner.nextLine();
	    
	    Estudante estudanteEncontrado = null;
	    
	    for(Estudante estudante : estudantes){
	        if(estudantes.isEmpty()){
	            estudanteEncontrado = estudante;
	            break;
	        }
	    }
	    if(estudanteEncontrado == null){
	        System.out.println("Estudante não encontrado");
	        return;
	    }
	    
	    System.out.println("Novo nome: (Deixe em branco para manter o atual)");
	    String novoNome = scanner.nextLine();
	    if(!novoNome.isEmpty()){
	        estudanteEncontrado.setNome(novoNome);
	    }
	}
	
	private static void deletarEstudante(){
	    System.out.println("ID do estudante: ");
	    String id = scanner.nextLine();
	    
	    boolean encontrado = false;
	        Iterator <Estudante> iterator = estudantes.iterator();
	        while(iterator.hasNext()){
	            Estudante estudante = iterator.next();
	            if(estudante.getId().equals(id)){
	                iterator.remove();
	                System.out.println("Jogador deletado com sucesso");
	                encontrado = true;
	                break;
	            }
	        }
	        if(!encontrado){
	            System.out.println("Jogador não encontrado");
            	}
        	}
	}   
}
