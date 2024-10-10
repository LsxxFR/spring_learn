package com.learn.vo.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class FicVo {

    private long id;
    private String FictionName;
    private String Author;
    private String Intro;
    private String LastUpdateTime;

}
