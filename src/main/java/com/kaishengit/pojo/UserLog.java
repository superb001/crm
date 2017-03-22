package com.kaishengit.pojo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/21 0021.
 */
public class UserLog implements Serializable{

    private Integer id;
    private String logintime;
    private String loginip;
    private Integer userid;
    // get set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "UserLog{" +
                "id=" + id +
                ", logintime='" + logintime + '\'' +
                ", loginip='" + loginip + '\'' +
                ", userid=" + userid +
                '}';
    }
}
