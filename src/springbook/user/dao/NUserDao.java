package springbook.user.dao;

import springbook.user.domain.User;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao implements ConnectionMaker{
    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        return null;
    }
}
