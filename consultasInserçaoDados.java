import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main{
	public static void main(String[] args) {

        String jcbdURL = "jcbd:mysql://localhost:3306/database";
        String username = "root";
        String password = "password";

        String sql = "INSERT INTO users (username, email) VALUE (?, ?)";
        
        try{
        Connection connection = DriverManager.getConnection(jcbdURL, username, password);
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "gean");
        statement.setString(2, "gean@gg.com");
        
        int rows = statement.executeUpdate();
        
        if(rows > 0){
            System.out.println("Novo usuario inserido com sucesso\n");
        }
        connection.close();
        } catch(SQLException e){
            e.printStackTrace();
        
        }
	}
}
