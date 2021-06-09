import entity.User;
import mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import sqlSessionFactory.GetSqlSessionFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public void inserUser(User user) throws IOException {
        GetSqlSessionFactory sqlSessionFactory = new GetSqlSessionFactory();
        SqlSession session = sqlSessionFactory.getSqlSession();
        user.setUser("hongkong",455,"男",100);
        session.insert("addUser",user);
        session.commit();
        session.close();
    }
    public void deleteUser(int id) throws IOException {
        GetSqlSessionFactory sqlSessionFactory = new GetSqlSessionFactory();
        SqlSession session = sqlSessionFactory.getSqlSession();
        session.delete("deleteUser",id);
        session.commit();
        session.close();
    }
    public void updateUser(User user) throws IOException {
        GetSqlSessionFactory sqlSessionFactory = new GetSqlSessionFactory();
        SqlSession session = sqlSessionFactory.getSqlSession();
        user = session.selectOne("selectOne",1);
        user.setUsername("zhangsanwuji");
        session.update("updateUser",user);
        session.commit();
        session.close();
    }
    public static List<User> allUser(UserMapper mapper){
        List<User> userList = mapper.allUser();
        return userList;
    }
    public static void main(String[] args) throws IOException {
        Test test = new Test();
        GetSqlSessionFactory sqlSessionFactory = new GetSqlSessionFactory();
        SqlSession session = sqlSessionFactory.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);

        for (User user :  allUser(userMapper)) {
            System.out.println(user.toString());
        }

    }

}
