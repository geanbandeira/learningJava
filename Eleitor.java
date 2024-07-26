import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        
        LocalDate dataEleicao = LocalDate.of(2024, 10, 6); 
        int idade = calcularIdade(dataNascimento, dataEleicao);
        
        String tipoDeEleitor = determinarTipoDeEleitor(idade);
        
        System.out.println("Idade no dia da eleição: " + idade);
        System.out.println("Tipo de eleitor: " + tipoDeEleitor);
        
        scanner.close();
    }
    
    public static int calcularIdade(LocalDate dataNascimento, LocalDate dataReferencia) {
        return Period.between(dataNascimento, dataReferencia).getYears();
    }
    
    public static String determinarTipoDeEleitor(int idade) {
        if (idade < 16) {
            return "Não tem direito a votar";
        } else if (idade >= 16 && idade < 18) {
            return "Voto facultativo";
        } else if (idade >= 18 && idade <= 70) {
            return "Voto obrigatório";
        } else {
            return "Voto facultativo";
        }
    }
}
