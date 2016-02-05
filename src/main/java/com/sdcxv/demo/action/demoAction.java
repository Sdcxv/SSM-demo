package com.sdcxv.demo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sdcxv.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sdcxv on 2016/2/5.
 */
public class demoAction extends ActionSupport {
    private static final long serialVersionUID = -3617424650852024180L;
    @Autowired
    private DemoService demoService;
    private String name;
    private String gender;
    private int age;

    public void insert() {
        System.out.println("开始执行插入数据。。。");
        Map map = new HashMap();
        map.put("name", name);
        map.put("gender", gender);
        map.put("age", age);
        this.demoService.insert(map);
        System.out.println("插入数据成功：" + map);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
