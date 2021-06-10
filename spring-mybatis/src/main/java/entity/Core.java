package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Getter
@Setter
@ToString
@Component("core")
public class Core {
    @Resource(name = "user")
    private User user;

    private int core;
}
