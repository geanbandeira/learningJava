import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main{
	public static void main(String[] args) {
        
        String jdbcURL = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";

        try{
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Conectando a base de dados");
            connection.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

	}
}
