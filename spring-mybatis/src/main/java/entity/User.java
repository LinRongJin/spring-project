package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@Component("user")
public class User {
    private int id;
    private String username;
    private String sex;
    private int age;
}
