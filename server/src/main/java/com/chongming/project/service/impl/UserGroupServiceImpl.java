package com.chongming.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chongming.project.entity.UserGroup;
import com.chongming.project.service.UserGroupService;
import com.chongming.project.mapper.UserGroupMapper;
import org.springframework.stereotype.Service;

/**
* @author monty
* @description 针对表【user_group(用户组：用于用户前端身份和鉴权)】的数据库操作Service实现
* @createDate 2024-04-27 16:04:34
*/
@Service
public class UserGroupServiceImpl extends ServiceImpl<UserGroupMapper, UserGroup>
    implements UserGroupService{

}




