package com.learn.servcie.imply;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.entity.FicDo;
import com.learn.mapper.FicMapper;
import com.learn.servcie.FicService;
import org.springframework.stereotype.Service;


@Service
public class Imply extends ServiceImpl<FicMapper, FicDo> implements FicService {


}
