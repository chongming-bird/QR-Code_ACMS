package com.chongming.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chongming.project.dao.Auth;
import com.chongming.project.service.AuthService;
import com.chongming.project.mapper.AuthMapper;
import org.springframework.stereotype.Service;

/**
* @author monty
* @description 针对表【auth(用户权限管理)】的数据库操作Service实现
* @createDate 2024-04-27 16:04:34
*/
@Service
public class AuthServiceImpl extends ServiceImpl<AuthMapper, Auth>
    implements AuthService{

}




