import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pagamento{
    private String nomeFuncionario;
    private double valor;
    private String dataPagamento;
    
public Pagamento(String nomeFuncionario, double valor, String dataPagamento){
    this.nomeFuncionario = nomeFuncionario;
    this.valor = valor;
    this.dataPagamento = dataPagamento;
}    
    @Override
    public String toString(){
        return "Nome: " + nomeFuncionario + "\n Salário: " + valor + "\n Data do Pagamento: " + dataPagamento ;
    }
}


public class ControlePagamentos{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Pagamento> pagamentos = new ArrayList<>(); 
		
		System.out.println("Sistemas de Pagamentos");
		
		while(true){
		    System.out.println("1. Adicionar Funcionario");
		    System.out.println("2. Listas Funcionarios e Pagamentos");
		    System.out.println("3. Sair");
		    System.out.println("Escolha uma das opções");
            int opcao = scanner.nextInt();
		    scanner.nextLine();
		    
		    if(opcao == 1){
		        System.out.println("Nome do funcionario: ");
		        String nomeFuncionario = scanner.nextLine();
		        System.out.println("Entre com Salário: ");
		        double valor = scanner.nextDouble();
		        System.out.println("Data de pagamento: ");
		        String dataPagamento= scanner.nextLine();
		    }else if(opcao == 2){
		       for(Pagamento pagamento : pagamentos){
		       System.out.println(pagamento);
		    }
		} else if(opcao ==3){
		    break;
		}else{
		    System.out.println("Opção Inválida");
		}
	}
	scanner.close();
	}
}




