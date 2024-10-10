package com.learn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("fictioninfo")
public class FicDo {

    @TableId(type = IdType.AUTO)
    private long id;

    private String fictionname;
    private String Author;
    private String Intro;
    private String latestupdatetime;

}
