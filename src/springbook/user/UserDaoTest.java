package springbook.user;

import springbook.user.dao.ConnectionMaker;
import springbook.user.dao.DUserDao;
import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new DaoFactory().userDao();

        User user = new User();

        user.setId("kysthayer");
        user.setName("김영석");
        user.setPassword("rladud");

        userDao.add(user);

        System.out.println(user.getId() + " 등록 성공");
    }
}
