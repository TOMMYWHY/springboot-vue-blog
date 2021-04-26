package com.tommy.why.controller;


import com.tommy.why.common.lang.Result;
import com.tommy.why.entity.User;
import com.tommy.why.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2021-04-26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public Result test(@PathVariable("id") Long id){
        User user = userService.getById(id);
//        return Result.succ(200,"successful",user);
        return Result.succ(user);
    }
}
