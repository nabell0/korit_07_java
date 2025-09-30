package ch17_bean;

import lombok.Data;
import lombok.Setter;

@Data//여기에 애너테이션을 달면 class level
public class UserEntitiyLombok {
    //여기에 달면 field level
    private int username;
    @Setter
    private int password;
    private String email;
    private String name;

}
