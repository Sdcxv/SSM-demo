package com.sdcxv.demo.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Sdcxv on 2016/2/5.
 */
public class HelloAction extends ActionSupport implements ServletResponseAware {
    private static final long serialVersionUID = -6493858961444458651L;
    private HttpServletResponse response;

    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.response = response;
    }

    public String execute() throws Exception {
        System.out.println("HelloAction.execute is executing...");
        return SUCCESS;
    }

    public void say() throws IOException {
        System.out.println("HelloAction.say is executing....");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<span style='color:red;'>啊哈，We are here!</span>");
        out.close();
    }
}
