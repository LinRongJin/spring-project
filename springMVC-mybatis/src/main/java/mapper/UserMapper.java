package mapper;

import entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    public List<User> allUser();
}
