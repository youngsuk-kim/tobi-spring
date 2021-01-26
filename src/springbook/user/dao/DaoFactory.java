package springbook.user.dao;


public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = new DUserDao();
        return new UserDao(connectionMaker);
    }
}
