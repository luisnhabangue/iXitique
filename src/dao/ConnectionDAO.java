package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionDAO {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties properties = loadProperties();
                String url = properties.getProperty("databaseurl");
                connection = DriverManager.getConnection(url, properties);
            } catch (SQLException e) {
                throw new dbExceptions(e.getMessage());
            }
        }
        return connection;

    }
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) connection.close();

        } catch (SQLException e) {
            throw new dbExceptions(e.getMessage());
        }

    }
    private static Properties loadProperties() {
        try {
            FileInputStream fis = new FileInputStream("src/dao/dbConnection.properties");
            Properties properties = new Properties();
            properties.load(fis);
            return properties;
        } catch (IOException e) {
            throw new dbExceptions(e.getMessage());
        }

    }


}
