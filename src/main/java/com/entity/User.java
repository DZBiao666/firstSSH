package com.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
}
