import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main{
	public static void main(String[] args) {

        String jcbdURL = "jcbd:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";
        
        try{
            Connection connection = DriverManager.getConnection(jcbdURL, username, password);
            String sql = "SELECT * FROM users";
            
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                String user = result.getString("username");
                String email = result.getString("email");
                System.out.println("User: " + user + "\nEmail: " + email);
            }
            
            connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
