package com.chongming.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chongming.project.dao.User;
import com.chongming.project.service.UserService;
import com.chongming.project.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author monty
* @description 针对表【user(用户账户：用于保存用户登录信息)】的数据库操作Service实现
* @createDate 2024-04-27 16:04:34
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




