import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Certidao{
    private String tipo;
    private String nomeCidadao;
    private String dataEmissao;
    
    public Certidao(String tipo, String nomeCidadao, String dataEmissao){
        this.tipo = tipo;
        this.nomeCidadao = nomeCidadao;
        this.dataEmissao = dataEmissao;
    }
    
    public String toString(){
        return "Tipo de Certidao: " + tipo + "\n Nome do Cidadão: " + nomeCidadao + "\n Data de Emissão: " + dataEmissao; 
    }
    
}

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Certidao> certidoes = new ArrayList<>();
	    
	    System.out.println("Sistema de Emissão de Certidões");
		
	    while(true){
        System.out.println("1. Inserir Nova Certidão");
        System.out.println("2. Listas Certidões");
        System.out.println("3. Sair");
        System.out.println("Escolha uma das Opções");
	    
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        if(opcao == 1){
            System.out.println("Qual o tipo de Certidão?");
            String tipo = scanner.nextLine();
            System.out.println("Nome do cidadão: ");
            String nomeCidadao = scanner.nextLine();
            System.out.println("Data de Emissão: (dd/mm/yyyy) ");
            String dataEmissao = scanner.nextLine();
        certidoes.add(new Certidao(tipo, nomeCidadao, dataEmissao));
        }else if(opcao == 2){
            for(Certidao certidao : certidoes){
                System.out.println(certidao);
            }
        }else if(opcao == 3){
            break;
        } else{
            System.out.println("Opção Inválida");
        }  
	}
	scanner.close();
	}
}

