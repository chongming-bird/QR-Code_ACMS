package com.chongming.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chongming.project.dao.AccessControlList;
import com.chongming.project.service.AccessControlListService;
import com.chongming.project.mapper.AccessControlListMapper;
import org.springframework.stereotype.Service;

/**
* @author monty
* @description 针对表【access_control_list(门禁列表)】的数据库操作Service实现
* @createDate 2024-04-27 16:04:34
*/
@Service
public class AccessControlListServiceImpl extends ServiceImpl<AccessControlListMapper, AccessControlList>
    implements AccessControlListService{

}




