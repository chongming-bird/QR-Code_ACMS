package com.chongming.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chongming.project.entity.Hits;
import com.chongming.project.service.HitsService;
import com.chongming.project.mapper.HitsMapper;
import org.springframework.stereotype.Service;

/**
* @author monty
* @description 针对表【hits(用户点击)】的数据库操作Service实现
* @createDate 2024-04-27 16:04:34
*/
@Service
public class HitsServiceImpl extends ServiceImpl<HitsMapper, Hits>
    implements HitsService{

}




