package com.seu.test;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by snz on 2016/12/19.
 */
public class TestAction extends ActionSupport {//动作类

    @Override
    public String execute() throws Exception {
        return  SUCCESS;
    }
    public String sayhello(){
        System.out.println("HelloAction");
        return "success";
    }
}
