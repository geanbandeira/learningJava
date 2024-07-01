import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Funcionario{
    private String nome;
    private String cargo;
    private double salario;
    
    public  Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salario: R$ " + salario;
    }
}

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		System.out.println("Gerenciamento de funcionarios");
        
		while(true){
		    System.out.println("1. Adicionar Funcionarios");
		    System.out.println("2. Listar Funcionarios");
		    System.out.println("3. Sair");
		    System.out.println("Escolha uma opção");
		    int opcao = scanner.nextInt();
		    scanner.nextLine();
		    
		    if(opcao ==1){
		        System.out.println("Digite seu nome: ");
		        String nome = scanner.nextLine();
		        System.out.println("Digite seu cargo: ");
		        String cargo = scanner.nextLine();
		        System.out.println("Digite seu salário: ");
		        double salario = scanner.nextDouble();
		        
		        funcionarios.add(new Funcionario(nome, cargo, salario));
		    } else if(opcao ==2){
		        for(Funcionario funcionario : funcionarios){
		            System.out.println(funcionario);
		        }
		        } else if(opcao ==3){
		            break;
		        } else{
		            System.out.println("Opção inválida");
		        }
		    }
		    scanner.close();
		
		
	}
}






