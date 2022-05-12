package singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class Singleton {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "shree9592");
                System.out.println("connection done");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

}
