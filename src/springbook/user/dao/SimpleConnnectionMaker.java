package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://localhost/tobi?characterEncoding=UTF-8&serverTimezone=UTC", "root", "");
            return c;
    }
}
