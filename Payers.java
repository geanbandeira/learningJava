import java.util.Scanner;
import java.util.*;

class Player{
    private String nome;
    private String id;
    private String dataNascimento;
    private String endereco;
    
    public Player(String nome, String id, String dataNascimento, String endereco){
        this.nome = nome;
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id =id;
    }
    
    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nID: " + id + "\nData Nascimento: " + dataNascimento + "\nEndereço: " + endereco;
    }
}

public class Main{
    public static ArrayList<Player> players = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

    int opcao = 0;
    
    do{
        mostrarMenu();
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch(opcao){
            case 1:
                cadastrarPlayer();
                break;
            case 2:
                listarPlayers();
                break;
            case 3:
                buscarPlayer();
                break;
            case 4:
                atualizarPlayer();
                break;
            case 5:
                deletarPlayer();
                break;
            case 0:
                System.out.println("Saindo...");
            default:
                System.out.println("Opçao invalida, tente novamente\n");
        }
    }while(opcao != 0);
}

    private static void mostrarMenu(){
        System.out.println("\n1. Cadastrar");
        System.out.println("2. Listar");
        System.out.println("3. Buscar");
        System.out.println("4. Atualizar");
        System.out.println("5. Deletar");
        System.out.println("Escolha uma das opçoes\n");
    }
    
    private static void cadastrarPlayer(){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("ID: ");
        String id = scanner.nextLine();
        System.out.println("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        
        Player player = new Player(nome, id, dataNascimento, endereco);
        players.add(player);
        System.out.println("Player cadastrado com sucesso");
    }
    
    private static void listarPlayers(){
        if(players.isEmpty()){
            System.out.println("Nenhum Player encontrado\n");
        }else{
            System.out.println("-- Lista de Players --");
            for(Player player : players){
                System.out.println(player);
            break;
        }
    }
    }
    
    private static void buscarPlayer(){
        System.out.println("Entre com ID: ");
        String id = scanner.nextLine();
        
        boolean encontrado = false;
        for(Player player : players){
            if(player.getId().equals(id)){
                System.out.println("Player encontrado\n");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Player nao encontrado");
        }
    }
    
    private static void atualizarPlayer(){
        System.out.println("ID: ");
        String id = scanner.nextLine();
        
        Player playerEncontrado = null;
        for(Player player : players){
            if(player.getId().equals(id)){
                playerEncontrado = player;
                break;
            }
        }
        if(playerEncontrado ==null){
            System.out.println("Player nao encontrado");
            return;
        }
        
        System.out.println("Novo Endereço: (Deixar em branco para manter o atual)");
        String novoEndereco = scanner.nextLine();
        if(!novoEndereco.isEmpty()){
            playerEncontrado.setEndereco(novoEndereco);
        }
        System.out.println("Player atualizado com sucesso");
    }
    
    private static void deletarPlayer(){
        System.out.println("ID: ");
        String id = scanner.nextLine();
        
        boolean encontrado = false;
        Iterator<Player> iterator = players.iterator();
        while(iterator.hasNext()){
            Player player = iterator.next();
            if(player.getId().equals(id)){
                iterator.remove();
                System.out.println("Player removido com sucesso\n");
                break;
            }
        }
        if(!encontrado){
            System.out.println("Player nao encontrado");
        }
    }
    
    
    

}





