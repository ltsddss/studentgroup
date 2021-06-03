package com.lts.pojo.userpojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLogin {

    private Integer id;//登录的时候用的id

    private String Username;//登录的用户名

    private String password;//登录的密码

}
