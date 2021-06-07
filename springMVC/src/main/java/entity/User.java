package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.converter.StringHttpMessageConverter;

@Getter
@Setter
@ToString
public class User {
    private int id;
    private String username;
    private String sex;
    private int age;
    public void serUser(String username,int id,String sex,int age){
        this.age = age;
        this.id = id;
        this.username = username;
        this.sex = sex;
    }
}
