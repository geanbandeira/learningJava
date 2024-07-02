import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Consulta{
    private String nomeCidadao;
    private String data;
    private String hora;
    private String medico;
    
    public Consulta(String nomeCidadao, String data, String hora, String  medico){
        this.nomeCidadao = nomeCidadao;
        this.data = data;
        this.hora = hora;
        this.medico = medico;
    }
    
    @Override
    public String toString(){
        return "Cidadão: " + nomeCidadao + "Data: " + data + "Hora: " + hora + "Médico: " + medico;
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Consulta> consultas = new ArrayList<>();
		System.out.println("Sistema de Gere, de Consultas");
		
		while(true){
		    System.out.println("1. Agendar Consulta");
		    System.out.println("2. Listar Consultas");
		    System.out.println("3. Sair");
		    System.out.println("Escolha uma opção");
		    int opcao = scanner.nextInt();
		    scanner.nextLine();
		    
		    if(opcao ==1){
		        System.out.println("Entre com seu nome: ");
		        String nomeCidadao = scanner.nextLine();
		        System.out.println("Entre com a data(dd/MM/yyyy)");
		        String data = scanner.nextLine();
		        System.out.println("Hora: (HH:mm)");
		        String hora = scanner.nextLine();
		        System.out.println("Médico: ");
		        String medico = scanner.nextLine();
		        
		        consultas.add(new Consulta(nomeCidadao, data, hora, medico));
		    }else if(opcao == 2){
		        System.out.println("Consultas");
		        for(Consulta consulta : consultas){
		            System.out.println(consultas);
		        }
		    }else if(opcao ==3){
		        break;
		    }else{
		        System.out.println("Opção Inválida");
		    }
		}
		
		scanner.close();
		
	}
}








