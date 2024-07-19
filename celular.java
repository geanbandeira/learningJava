import java.util.Scanner;
import java.util.*;

class Celular{
    private String nome;
    private String marca;
    private String preco;
    
    public Celular(String nome, String marca, String preco){
        this.nome =nome;
        this.marca = marca;
        this.preco = preco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome =nome;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getPreco(){
        return preco;
    }
    
    public void setPreco(String preco){
        this.preco = preco;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nMarca:" + marca + "\nPreço: \n" + preco;
    }
    
}

public class Main{
    public static ArrayList<Celular> celulares = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    
	    int opcao = 0;
	    
	    do{
	        mostrarMenu();
	        opcao = scanner.nextInt();
	        scanner.nextLine();
	        
	        switch(opcao){
	            case 1:
	                cadastrarCelular();
	                break;
                case 2:
                    listarCelulares();
                    break;
                case 3:
                    buscarCelular();
                    break;
                case 4:
                    atualizarCelular();
                    break;
                case 5:
                    deletarCelular();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("opçao invalida, tente novamente\n");
	        }
	    }while(opcao !=0);
	}
	
	private static void mostrarMenu(){
	    System.out.println("1. Cadastrar Celular");
	    System.out.println("2. Listar Celulares");
	    System.out.println("3. Buscar Celular");
	    System.out.println("4. Atualizar Celular");
	    System.out.println("5. Deletar Celular");
	    System.out.println("0. Sair");
	}
	
	private static void cadastrarCelular(){
	    System.out.println("Nome: ");
	    String nome = scanner.nextLine();
	    System.out.println("Marca: ");
	    String marca = scanner.nextLine();
	    System.out.println("Preço: ");
	    String preco = scanner.nextLine();

	    Celular celular = new Celular(nome, marca, preco);
	    celulares.add(celular);
	    System.out.println("Celular cadastrado com sucesso\n");
	}
	
	private static void listarCelulares(){
	    if(celulares.isEmpty()){
	        System.out.println("Nenhum celular\n");
	    }else{
	        System.out.println("Lista de Celulares");
	        for(Celular celular : celulares){
	            System.out.println(celular);
	            System.out.println("\n");
	            break;
	        }
	    }
	}
	
	private static void buscarCelular(){
	    System.out.println("Nome do celular: ");
	    String nome = scanner.nextLine();
	    
	    boolean encontrado = false;
	    for(Celular celular : celulares){
	        if(celular.getNome().equals(nome)){
	            System.out.println("Celular encontrado\n");
                encontrado = true;
                break;
	        }
	    }
	    if(!encontrado ){
	        System.out.println("Não encontrado\n");
	    }
	}
	
	private static void atualizarCelular(){
	    System.out.println("Nome: ");
	    String nome = scanner.nextLine();
	    
	    Celular celularEncontrado = null;
	    for(Celular celular : celulares){
	        if(celular.getNome().equals(nome)){
	            System.out.println("Celular encontrado\n");
	            celularEncontrado = celular;
	            System.out.println(celular);
	            break;
	        }
	    }
	    if(celularEncontrado == null){
	        System.out.println("Celular nao ecnontrado");
	        return;
	    }
	    
	    System.out.println("Novo Preço: ()");
	    String novoPreco = scanner.nextLine();
	    if(!novoPreco.isEmpty()){
	        celularEncontrado.setPreco(novoPreco);
	    }
	    System.out.println("Dados atualizado com sucesso\n");
	}
	
	private static void deletarCelular(){
	    System.out.println("Nome do celular: ");
	    String nome = scanner.nextLine();
        
        boolean encontrado = false;
        Iterator <Celular> iterator = celulares.iterator();
        while(iterator.hasNext()){
            Celular celular = iterator.next();
            if(celular.getNome().equals(nome)){
                iterator.remove();
                System.out.println("Removido com sucesso\n");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Celular nao encontrado");
        } 
}
}
