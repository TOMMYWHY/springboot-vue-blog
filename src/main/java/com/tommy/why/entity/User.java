package com.tommy.why.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 
 * </p>
 *
 * @author tommywhy
 * @since 2021-04-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @NotBlank(message="username cannot empty~!")
    private String username;

    private String avatar;

    @NotBlank(message="email cannot empty~!")
    @Email(message="email format error~!")
    private String email;

    @NotBlank(message="password cannot empty~!")
    private String password;

    private Integer status;

    private LocalDateTime created;

    private LocalDateTime lastLogin;


}
