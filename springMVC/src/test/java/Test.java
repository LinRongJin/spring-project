import entity.User;
import sqlSessionFactory.GetSqlSessionFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        GetSqlSessionFactory sqlSessionFactory = new GetSqlSessionFactory();
        List<User> userList = sqlSessionFactory.getSqlSession().selectList("allUser");
        for (User user : userList) {
            System.out.println(user.toString());
        }

    }
}
