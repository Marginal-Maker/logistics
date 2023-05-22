package com.example.dto;

import com.example.pojo.User;

import java.util.List;

/**
 * @descriotion
 * @author MARGIN
 * @data 2023/05/16/12:04
 */
public class UserDto extends BasePage{
    private User user;
    private Integer roleId;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getRoleIds() {
        return roleId;
    }

    public void setRoleIds(Integer roleId) {
        this.roleId = roleId;
    }
}
