package com.tommy.why.common.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class LoginDto implements Serializable {

     @NotBlank(message="username cannot empty~!")
    private String username;


    @NotBlank(message="password cannot empty~!")
    private String password;
}
