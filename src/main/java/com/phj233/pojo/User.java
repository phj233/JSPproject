/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.phj233.pojo;

/**
 * @projectName: JSPproject
 * @package: com.phj233.pojo
 * @className: User
 * @author: phj233
 * @date: 2022/10/13 16:15
 * @version: 1.0
 */
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String email;
    private Boolean is_admin;

    public User(Integer uid, String username, String password, String email, Boolean is_admin) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.email = email;
        this.is_admin = is_admin;
    }
    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", is_admin=" + is_admin +
                "}\n";
    }
    public Boolean getAdmin() {
        return is_admin;
    }
    public void setAdmin(Boolean is_admin) {
        this.is_admin = is_admin;
    }
    public Integer getId() {
        return uid;
    }

    public void setId(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
