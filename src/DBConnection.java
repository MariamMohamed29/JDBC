import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Connection {
    private static final String HOST="";
    private static final int PORT=0;
    private static final String DB_NAME="StudentDataBase";
    private static final String USERNAME="";
    private static final String PASSWORD="";


    public static Connection makeConnection() {
        Connection connection = null;
        try {
            connection = (Connection) DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s", HOST, PORT, DB_NAME), USERNAME, PASSWORD);
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return (Connection) connection;
    }

}
