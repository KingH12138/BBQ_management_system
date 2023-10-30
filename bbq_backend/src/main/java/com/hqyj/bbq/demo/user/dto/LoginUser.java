package com.hqyj.bbq.demo.user.dto;

import lombok.Data;

@Data
public class LoginUser {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
