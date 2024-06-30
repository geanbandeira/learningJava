import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main{
	public static void main(String[] args) {
        int port = 1234;
        new Thread(() -> startServer(port)).start();
        startClient("local host", port);
	}
	
	public static void startServer(int port){
	    try (ServerSocket serverSocket = new ServerSocket(port)){
	        System.out.println("Servidor inicia na porta: " + port);
	        try(Socket clientSocket = serverSocket.accept();
	            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
	                String mensagem = in.readLine();
	                System.out.println("Servidor recebeu " + mensagem);
	                out.println("Mensagem recebida");
	            }
	    } catch(IOException e){
	        e.printStackTrace();
	    }
	}
	
	public static void startClient(String host, int port){
	    try(Socket socket = new Socket(host, port);
	        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
	        } catch (IOException e){
	            e.printStackTrace();
	        }
	}
	
}



