package com.sangeng.expression;


import com.sangeng.domain.LoginUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 自定义权限校验方法
 */
@Component("ex")
public class SGExpressionRoot {

    public boolean hasAuthority(String authority){
        //获取当前用户的权限
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUser loginUSer = (LoginUser) authentication.getPrincipal();
        List<String> permissions = loginUSer.getPermissions();

        //判断用户权限集合中是否存在authority
        return permissions.contains(authority);



    }
}
