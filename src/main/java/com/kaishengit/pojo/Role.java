package com.kaishengit.pojo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/21 0021.
 */
public class Role implements Serializable {

    private Integer id;
    private String rolename;
    // get set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
