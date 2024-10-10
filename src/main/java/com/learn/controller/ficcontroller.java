package com.learn.controller;

import cn.hutool.core.bean.BeanUtil;
import com.learn.entity.FicDo;
import com.learn.servcie.FicService;
import com.learn.vo.dto.FicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 和@ResponseBody作用相同，使得接口返回json而不是一个页面
@RequestMapping("/fic") // 提供访问路径
public class ficcontroller {

    @Autowired
    private FicService service;

    @GetMapping("/get/{id}")  // 通过id得到信息
    public ResponseEntity<FicVo> getFic(@PathVariable("id") Integer id){

        FicDo Do = service.getById(id);
        FicVo vo = BeanUtil.copyProperties(Do, FicVo.class);

        return ResponseEntity.ok(vo);
    }
}
