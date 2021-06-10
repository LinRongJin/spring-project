package service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    public void doSomething(){
        System.out.println("doService");
    }
}
