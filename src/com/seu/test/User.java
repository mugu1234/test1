package com.seu.test;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by gent on 2016/12/21.
 */
public class User extends ActionSupport {
    public String addUser(){
        System.out.println("添加用户");
        return SUCCESS;
    }
    public String updataeUser(){
        System.out.println("更新用户");
        return SUCCESS;
    }
    public String removeUser(){
        return SUCCESS;
    }

}
