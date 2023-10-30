package com.example.demo.user;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor  //无参构造对象
@AllArgsConstructor //有参构造对象
@Data   //必须加上这个才能被引用
public class User {
    private Integer id;
    private String username;
    private String permission;
    private String password;
    private String email;
    private LocalDateTime sendTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }
    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }
}
