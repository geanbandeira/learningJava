
public class Main{
	public static void main(String[] args) {

        String jdbcURL = "jcbd:mysql://localhost:3306/database";
        String username = "root";
        String password = "password"

        String sql = "INSERT INTO users (username, email) VALUE (?, ?)";
        
        Connection connection = DriverManager.getConnection(jcbdURL, username, password);
	}
}
