package com.tommy.why.util;

import com.tommy.why.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {
    /*从 shiro中获取当前登录信息*/
    public static AccountProfile getProfile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
//        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
