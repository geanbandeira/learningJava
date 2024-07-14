import java.util.Scanner;
import java.util.*;

class Usuario{
    private String nome;
    private String cpf;
    
    public Usuario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nCPF:" + cpf;
    }
    
}

public class Main{
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

    int opcao = 0;
    
    do{
        mostrarMenu();
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch(opcao){
            case 1:
                cadastrarUsuario();
                break;
            case 2:
                listarUsuarios();
                break;
            case 3:
                buscarUsuario();
                break;
            case 4:
                atualizarUsuario();
                break;
            case 5:
                deletarUsuario();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opçao invalida, tente novamente\n");
        }
    }while(opcao != 0);
}

    private static void mostrarMenu(){
        System.out.println("\n1. Cadastrar ");
        System.out.println("2. Listar ");
        System.out.println("3. Buscar");
        System.out.println("4. Atualizar Usuário");
        System.out.println("5. Deletar Usuário");
        System.out.println("0. Sair");
        System.out.println("Escolha das opçoes");
    }
    
    private static void cadastrarUsuario(){
        System.out.println("Nome: ");
        String nome= scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        
        Usuario usuario = new Usuario(nome, cpf);
        usuarios.add(usuario);
        System.out.println("Usuario cadastrado com sucesso\n");
    }
    
    private static void listarUsuarios(){
        if(usuarios.isEmpty()){
            System.out.println("Nenhum usuario encontrado\n");
        }else{
            System.out.println("\n-- Lista de Usuários --\n");
            for(Usuario usuario : usuarios){
                System.out.println(usuario);
            }
        }
        
    }
    
    private static void buscarUsuario(){
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        
        boolean encontrado = false;
        for(Usuario usuario : usuarios){
            if(usuario.getCpf().equals(cpf)){
                System.out.println("Usuário encontrado\n");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Usuário nao encontrado\n");
        }
    }
    
    private static void atualizarUsuario(){
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        
        Usuario usuarioEncontrado = null;
        for(Usuario usuario : usuarios){
            if(usuario.getCpf().equals(cpf)){
                usuarioEncontrado = usuario;
                break;
            }
        }
        if(usuarioEncontrado ==null){
            System.out.println("Usuario não encontrado");
            return;
        }
        
        
        System.out.println("Novo nome: (Deixe em branco para manter o atual)\n");
        String novoNome = scanner.nextLine();
        if(!novoNome.isEmpty()){
            usuarioEncontrado.setNome(novoNome);
        }
        
        System.out.println("Novo CPF: (Deixe em branco para manter o atual (raro atualizar))");
        String novoCpf = scanner.nextLine();
        if(!novoCpf.isEmpty()){
            usuarioEncontrado.setCpf(novoCpf);
        }
        System.out.println("Usuario cadastrado com sucesso");
    }
    
    private static void deletarUsuario(){
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        
        boolean encontrado = false;
        Iterator<Usuario> iterator = usuarios.iterator();
        while(iterator.hasNext()){
            Usuario usuario = iterator.next();
            if(usuario.getCpf().equals(cpf)){
                iterator.remove();
                System.out.println("Usuario deletado com sucesso\n");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Usuário nao encontrado\n");
        }
    }
}









