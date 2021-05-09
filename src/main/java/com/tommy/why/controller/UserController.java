package com.tommy.why.controller;


import com.tommy.why.common.lang.Result;
import com.tommy.why.entity.User;
import com.tommy.why.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tommywhy
 * @since 2021-04-26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/{id}")
    public Result test(@PathVariable("id") Long id){
        User user = userService.getById(id);

//        return Result.succ(200,"successful",user);
        return Result.succ(user);
    }

    @PostMapping ("/save")
    public  Object save (@Validated @RequestBody User user){
        return Result.succ(user);
    }

    @GetMapping("/index")
    public  Object index(){
        User user = userService.getById(1L);
        return Result.succ(200,"success~!",user);
    }
}
