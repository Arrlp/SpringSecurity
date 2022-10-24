package com.sangeng.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    //权限校验
    //@ex表示获取容器中名字为ex的bean对象
    @PreAuthorize("@ex.hasAuthority('system:dept:list')")
//    @PreAuthorize("hasAuthority('system:dept:list')")
//    @PreAuthorize("hasAnyAuthority('admin','test','system:dept:list')")
//    @PreAuthorize("hasRole('system:dept:list')")  //参数拼上前缀ROLE_
//    @PreAuthorize("hasAnyRole('admin','system:dept:list')")
    public String hello(){
        return "hello";
    }



}
