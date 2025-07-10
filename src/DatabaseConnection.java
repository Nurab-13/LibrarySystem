import java.sql.Connection;
import java.sql.DriverManager;//object of connection
import java.sql.SQLException;

public class DatabaseConnection {
    private static String dbName = "librarydb";
    private static String path = "jdbc:mysql://localhost:3306/"+dbName;
    private static String username = "root";
    private static String password = "";

    public static Connection connect() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(path, username, password);
        return conn;
    }
    public static void main(String[] args) {
        try{
            if(DatabaseConnection.connect() != null){
                System.out.println("Connected to the database");
            }
            else{
                System.out.println("Connection Failed");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}