package com.lts.mapper;

import com.lts.pojo.User;
import com.lts.pojo.userpojo.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface userMapper {

//    增加用户
    int addUser(User user);

//    注销用户
    int deleteUser(Integer id);

//    查询用户(用于显示个人信息)

    User queryUser(String username);

//    修改用户信息
    int updateUser();

}
