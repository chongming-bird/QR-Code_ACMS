package com.chongming.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chongming.project.dao.AccessToken;
import com.chongming.project.service.AccessTokenService;
import com.chongming.project.mapper.AccessTokenMapper;
import org.springframework.stereotype.Service;

/**
* @author monty
* @description 针对表【access_token(登陆访问时长)】的数据库操作Service实现
* @createDate 2024-04-27 16:04:34
*/
@Service
public class AccessTokenServiceImpl extends ServiceImpl<AccessTokenMapper, AccessToken>
    implements AccessTokenService{

}




