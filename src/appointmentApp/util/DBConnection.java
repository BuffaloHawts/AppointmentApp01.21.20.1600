package appointmentApp.util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    /**
     * Opens connection to database based on following info:
     * Server name: 3.227.166.251
     * Database name: U04s4b
     * Username: U04s4b
     * Password: 53688332557
     */


//JDBC URL
    private static final String protocol = "jdbc";
    private static final String vendorName = ":mysql:";
    private static final String ipAddress = "//3.227.166.251/U04s4b";
    //URL
    private static final String jdbcURL = protocol + vendorName + ipAddress;

    //Driver interface reference
    private static final String driver = "com.mysql.jdbc.Driver";
    static Connection conn;

    private static final String username = "U04s4b"; //Username
    private static final String password = "53688332557"; //password



    public static Connection startConnection() {
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connection Successful, Jason");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void closeConnection() throws SQLException {
        conn.close();
        System.out.println("Connection closed, Jason");
    }



}
