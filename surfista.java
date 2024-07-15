import java.util.Scanner;
import java.util.*;

class Surfista{
    private String nome;
    private String id;
    private String nacionalidade;
    
    public Surfista(String nome, String id, String nacionalidade){
        this.nome =nome;
        this.id = id;
        this.nacionalidade = nacionalidade;
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
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nID: " + id + "\nNacionalidade: " + nacionalidade;
    }
}

public class Main{
    public static ArrayList<Surfista> surfistas = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    
	    int opcao = 0;
	    
	    do{
	        mostrarMenu();
	        opcao = scanner.nextInt();
	        scanner.nextLine();
	        
	        switch(opcao){
	            case 1:
	                cadastrarSurfista();
	                break;
	            case 2:
	                listarSurfista();
	                break;
	            case 3:
	                buscarSurfista();
	                break;
	            case 4:
	                atualizarSurfista();
	                break;
	            case 5:
	                deletarSurfista();
	                break;
	            case 0:
	                System.out.println("Saindo...");
	            default:
	                System.out.println("Opçao invalida, tente novamente");
	        }
	    }while(opcao !=0);
	}
	    
	    private static void mostrarMenu(){
	        System.out.println("\n1. Cadastrar");
	        System.out.println("2. Listar");
	        System.out.println("3. Buscar");
	        System.out.println("4. Atualizar");
	        System.out.println("5. Deletar");
	        System.out.println("Escolha uma das opçoes\n");
	    }
	    
    private static void cadastrarSurfista(){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("ID: ");
        String id = scanner.nextLine();
        System.out.println("Nacionalidade: ");
        String nacionalidade = scanner.nextLine();
        
        Surfista surfista = new Surfista(nome, id, nacionalidade);
        surfistas.add(surfista);
        System.out.println("Surfista cadastrado com sucesso\n");
    }
    
    private static void listarSurfista(){
        if(surfistas.isEmpty()){
            System.out.println("Surfista nao encontrado\n");
        }else{
            for(Surfista surfista : surfistas){
                System.out.println(surfista);
            }
        }
    }
    
    private static void buscarSurfista(){
        System.out.println("ID: ");
        String id = scanner.nextLine();
        
        boolean encontrado = false;
        for(Surfista surfista : surfistas){
            if(surfista.getId().equals(id)){
                System.out.println("-- Lista de Surfistas --\n");
                System.out.println(surfista);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("jogador nao encontrado");
        }
    }
    
    private static void atualizarSurfista(){
       System.out.println("Id: ");
	    String id = scanner.nextLine();
	    
	    Surfista surfistaEncontrado = null;
	    
	    for(Surfista surfista : surfistas){
	        if(surfistas.isEmpty()){
	            surfistaEncontrado = surfista;
	            break;
	        }
	    }
	    if(surfistaEncontrado == null){
	        System.out.println("Estudante não encontrado");
	        return;
	    }
	    
	    System.out.println("Novo nome: (Deixe em branco para manter o atual)");
	    String novoNome = scanner.nextLine();
	    if(!novoNome.isEmpty()){
	        surfistaEncontrado.setNome(novoNome);
	    }
	
    }
    
    private static void deletarSurfista(){
        System.out.println("ID: ");
        String id = scanner.nextLine();
        
        boolean encontrado = false;
        Iterator<Surfista> iterator = surfistas.iterator();
        while(iterator.hasNext()){
            Surfista surfista = iterator.next();
            if(surfista.getId().equals(id)){
                iterator.remove();
                System.out.println("Removido com sucesso\n");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Surfista nao encontrado\n");
        }
    }
	
}
