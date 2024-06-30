import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main{
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/meubanco";
        String user = "usuario";
        String password = "senha";
        
        try(Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement()){
            
            String sql = "SELECT *FROM tabela";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                System.out.println("ID: " + resultSet.getInt("id") + ", Nome: " + resultSet.getString("nome"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        
	}
	
}



