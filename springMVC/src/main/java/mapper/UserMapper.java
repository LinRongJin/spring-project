package mapper;

import entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    public List<User> allUser();

    @Select("select * from user where username like concat('%',#{0},'%')")
    public List<User> selectUserBy_Username(String username);

    @Insert("insert into user (id,username,sex,age) values (#{id},#{username},#{sex},#{age})")
    public void insertUser(User user);

    @Delete("delete from user where username = #{username}")
    public void deleteUser(String username);
}
