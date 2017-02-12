package com.seu.test;

import cn.dsna.util.images.ValidateCode;
import com.opensymphony.xwork2.ActionInvocation;
import org.apache.struts2.dispatcher.StrutsResultSupport;

/**
 * Created by gent on 2016/12/22.
 */
public class CAPTCHResult extends StrutsResultSupport {
    @Override
    protected void doExecute(String s, ActionInvocation actionInvocation) throws Exception {
      ValidateCode code=new ValidateCode(200,40,4,10);

    }
}
