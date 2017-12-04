package com.doerit.action;

import com.doerit.model.User;
import com.doerit.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {
    private String RETURNVALUE="success";
    private User user;
    private int id,age;
    private String other,name;
    @Autowired UserService userService;

    @Transactional
    public String save(){
        System.out.println("Starting execute..");
        int val=userService.insertBy(user);
        if(val==1){
            System.out.println("added data"+ user.getName());
            return RETURNVALUE;
        }else{
            System.out.println("failed");
            return "error";
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
