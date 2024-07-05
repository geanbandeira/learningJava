import java.util.Scanner;
import java.util.*;

class Cidadao{
    private String nome;
    private String cpf;
    private String endereco;
    private String dataNascimento;
    
    public Cidadao(String nome, String cpf, String endereco, String dataNascimento){
        this.nome =nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getEndereco(){
        return endereco
    }
    
    public String getDataNascimento(){
        return dataNascimento;
    }
    
    @Override
    public String toString(){
        return "\n Nome" + nome + "\n CPF: " + cpf + "\n Endereço: "+ endereco + "\n Data de Nascimento: " + dataNascimento;
    }
}


public class Prefeitura{
    private static List<Cidadao> cidadoes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String [] args){
        
        int opcao = 0;
        
        do{
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    cadastrarCidadao();
                    break;
                case 2:
                    listarCidadao();
                    break;
                case 3:
                    buscarCidadoes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                System.out.println("Opção Inválida");
            }
        }while(opcao != 0);
    }
    
    private static void mostrarMenu(){
        System.out.println("1. Cadastrar Cidadão");
        System.out.println("2. Listar Cidadões");
        System.out.println("3. Buscar Cidadão");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção");
    }
    
    private static void cadastrarCidadao(){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        
        Cidadao cidadao = new Cidadao(nome, endereco, dataNascimento, cpf);
        cidadoes.add(cidadao);
        System.out.println("Cidadão cadastrado com sucesso");
    }
    
    private static void listarCidadao(){
        
    }
    
    private static void buscarCidadoes(){
        
    }
    
    
    
    }
}



