import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//manipulando arquivos com FileReader e BufferedReader

public class Main {
    public static void main(String[] args) {
        
        try(BufferedReader br = new BufferedReader(new FileReader("text.txt"))){
            String line;
            
            while((line = br.readLine()) != null){
                System.out.println(line);
            }    
            }catch (IOException e){
                e.printStackTrace();
            }
        }
            
    }
