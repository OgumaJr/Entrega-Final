package br.senac.asterix.lojadeeletronicos.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;

        Class.forName("org.apache.derby.jdbc.ClientDataSource");

        connection = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/Asterix_PJ1",
                "root",
                "root");

        return connection;
    }
}
