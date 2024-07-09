import java.util.Scanner;
import java.util.*;

    class Jogador{
        private String nome;
        private String id;
        private String clube;
        private String endereco;
        private String dataNascimento;
    
    public Jogador(String nome, String id, String clube, String endereco, String dataNascimento){
        this.nome = nome;
        this.id = id;
        this.clube = clube;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
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
    
    public String getClube(){
        return clube;
    }
    
    public void setClube(String clube){
        this.clube = clube;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String dataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
public String toString(){
    return "\nNome: " + nome + "\nID: " + id + "\nClube: " + clube + "\nEndereço: " + endereco + "\nData de Nascimento: " + dataNascimento;
    }
}

public class Main{
    public static ArrayList<Jogador> jogadores = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    
    int opcao = 0;
    
    do{
        mostrarMenu();
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch(opcao){
            case 1:
                cadastrarJogadores();
                break;
            case 2:
                listarJogadores();
                break;
            case 3:
                buscarJogadores();
                break;
            case 4:
                atualizarJogador();
                break;
            case 5:
                deletarJogador();
            case 0:
                System.out.println("Saindo...");
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }while(opcao != 0);
}

    private static void mostrarMenu(){
        System.out.println("Sistema: Cadastro de Jogadores \n");
        System.out.println("1. Cadastrar jogadores");
        System.out.println("2. Listar Jogadores");
        System.out.println("3. Buscar Jogadores");
        System.out.println("4. Atualizar Dados");
        System.out.println("5. Deletar Jogador");
        System.out.println("Escolha uma das Opções");
        
    }

    private static void cadastrarJogadores(){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("ID: ");
        String id = scanner.nextLine();
        System.out.println("Clube: ");
        String clube = scanner.nextLine();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        
        Jogador jogador = new Jogador(nome, id, clube, endereco, dataNascimento);
        jogadores.add(jogador);
        System.out.println("Jogador cadastrado com sucesso\n");
        
    }

    private static void listarJogadores(){
        if(jogadores.isEmpty()){
            System.out.println("Nenhum jogador cadastrado\n");
        }else{
            for(Jogador jogador : jogadores){
                System.out.println("-- Lista de Jogadores -- \n");
                System.out.println(jogador);
            }
        }
    }
    
    private static void buscarJogadores(){
        System.out.println("Entre com o ID do jogador: ");
        String id = scanner.nextLine();
        
        boolean encontrado = false;
        for(Jogador jogador : jogadores){
            if(jogador.getId().equals(id)){
                System.out.println("Jogador Encontrado!\n");
                System.out.println(jogador);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Jogador não encontrado");
        }
    }


    private static void deletarJogador(){
        
    }

    private static void atualizarJogador(){
        
    }

}






