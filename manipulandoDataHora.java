import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main
{
	public static void main(String[] args) {

    LocalDateTime agora = LocalDateTime.now();    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh-MM-yyyy HH:mm:ss");
	String formatado = agora.format(formatter);
	System.out.println("Data e hora formatado: " + formatado);
	    
	}
}
