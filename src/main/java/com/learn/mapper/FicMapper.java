package com.learn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learn.entity.FicDo;


// 可调用已有的，也可在此类中自定义方法

/**
 * 1.给每一个mapper对象都加上@mapper注解
 * 2.在启动类上加上@mapperscan
 */
public interface FicMapper extends BaseMapper<FicDo> {


}
