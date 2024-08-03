import java.io.*;
import java.net.*;

public class Server{
	public static void main(String[] args) {
	    
	    try(ServerSocket serverSocket = new ServerSocket(1234)){
	        System.out.println("Server ativo na porta 1234");
	        Socket socket = serverSocket.accept();
	        InputStream input = socket.getInputStream();
	        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
	        
	        String message = reader.readLine();
	        System.out.println("Reiceved: " + message);
	        
	        reader.close();
	        socket.close();
	        } catch(IOException e){
	            e.printStackTrace();
	        }
	    }
	}
