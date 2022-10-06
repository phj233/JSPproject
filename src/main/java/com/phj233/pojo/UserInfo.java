package com.phj233.pojo;

public class UserInfo {
    private String uName,uPwd,uEmail;
    private Integer uId;
    public UserInfo() {
    }
    public UserInfo(String uName, String uPwd, String uEmail, Integer uId) {
        this.uName = uName;
        this.uPwd = uPwd;
        this.uEmail = uEmail;
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "用户名为='" + uName + '\'' +
                ", 密码为='" + uPwd + '\'' +
                ", 邮箱为='" + uEmail + '\'' +
                ", 用户uid为=" + uId +
                '}';
    }
}
