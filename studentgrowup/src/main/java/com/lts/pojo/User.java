package com.lts.pojo;
import com.lts.pojo.userpojo.UserLogin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class User extends UserLogin {
    private Integer id;//用户id
    private String username;//用户名
    private String password;//密码
    private String gender;//性别
    private String nation;//国家
    private String university;//大学
    private String Email;//邮箱
    private String power;
}
