package ConnectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    
    private static final String URL = "jdbc:mysql://localhost:3306/lms_gayan";
    private static final String USERNAME = "root";
    private static final String PASSWORD = ""; // your password

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
            
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database connected successfully");
            return conn;
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
