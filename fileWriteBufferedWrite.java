import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       
       try (BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"))){
           bw.write("Fé e Constância");
           bw.newLine();
           bw.write("Vamos");
       } catch(IOException e){
           e.printStackTrace();
       }
    }
}
