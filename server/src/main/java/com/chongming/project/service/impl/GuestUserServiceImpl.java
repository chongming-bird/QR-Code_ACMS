package com.chongming.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chongming.project.entity.GuestUser;
import com.chongming.project.service.GuestUserService;
import com.chongming.project.mapper.GuestUserMapper;
import org.springframework.stereotype.Service;

/**
* @author monty
* @description 针对表【guest_user(访客用户)】的数据库操作Service实现
* @createDate 2024-04-27 16:04:34
*/
@Service
public class GuestUserServiceImpl extends ServiceImpl<GuestUserMapper, GuestUser>
    implements GuestUserService{

}




