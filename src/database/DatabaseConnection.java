package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/smart_energy";

    private static final String USER =
            "root";

    private static final String PASSWORD =
            "root123";

    public static Connection getConnection() {

        try {

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(
                            URL,
                            USER,
                            PASSWORD
                    );

            System.out.println("Database connection successful!");

            return connection;

        } catch (ClassNotFoundException e) {

            System.out.println("MySQL JDBC Driver not found!");

            e.printStackTrace();

        } catch (SQLException e) {

            System.out.println("Database connection failed!");

            e.printStackTrace();
        }

        return null;
    }
}