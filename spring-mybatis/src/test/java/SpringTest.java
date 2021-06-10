import entity.Core;
import entity.User;
import mapper.UserMapper;
import org.apache.ibatis.javassist.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;
import sun.applet.Main;

import java.util.List;



public class SpringTest {
    @Autowired
    private UserMapper userMapper;

    public void allUser(){
        List<User> userList = userMapper.allUser();
        for (User user :
                userList) {
            System.out.println(user.toString());
        }
    }

    public static void main(String[] args) {
        SpringTest springTest = new SpringTest();
        springTest.allUser();
    }
}
