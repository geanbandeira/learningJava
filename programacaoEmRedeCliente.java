import java.io.*;
import java.net.*;

public class Client{
	public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 12345)){
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Olá, servidor");
            
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
	}
}
