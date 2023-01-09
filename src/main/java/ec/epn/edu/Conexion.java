package ec.epn.edu;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static String user = "postgres";
    private static String pass = "Kevincraft54";
    public static Connection connection;

    public static void initConn() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/debate", user, pass);
        } catch (Exception e) {
            System.out.println("**ERROR*****");
            System.out.println(e.getMessage());
            e.printStackTrace();
            e.getCause();
            e.getLocalizedMessage();
            System.out.println(e.toString());
        }
    }
}
