package com.chongming.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chongming.project.entity.Upload;
import com.chongming.project.service.UploadService;
import com.chongming.project.mapper.UploadMapper;
import org.springframework.stereotype.Service;

/**
* @author monty
* @description 针对表【upload(文件上传)】的数据库操作Service实现
* @createDate 2024-04-27 16:04:34
*/
@Service
public class UploadServiceImpl extends ServiceImpl<UploadMapper, Upload>
    implements UploadService{

}




