package com.doerit.action;

import com.doerit.model.User;
import com.doerit.model.UserNames;
import com.doerit.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

//User action class here all the struts action methods are defined
public class UserAction extends ActionSupport {
    private String RETURNVALUE="success";
    private User user;
    private int id,age;
    private String other,name;
    private UserService userService;
    private UserNames userNames;
    private List<User> namelist;

    public List<User> getNamelist() {
        return namelist;
    }

    public void setNamelist(List<User> namelist) {
        this.namelist = namelist;
    }

    public UserNames getUserNames() {
        return userNames;
    }

    public void setUserNames(UserNames userNames) {
        this.userNames = userNames;
    }

    //struts save method
    public String save(){
        System.out.println("Starting execute..");
        System.out.println("User added " + user.getName());

        //running the service
        int val = userService.insertBy(user);
        if (val == 1) {
            System.out.println("added data" + user.getName());
            return RETURNVALUE;
        } else {
            System.out.println("failed");
            return "error";
        }

    }

    public String getNames() {
       /* //userNames.setName(user.getName());
        System.out.println(userNames.getName() + " <<<THIS IS TYPED");
        namelist = userService.getNames(userNames.getName());
        // userNames.setNames(namelist);
        System.out.println("*****************");
        System.out.printf(namelist.toString() + " This is the list");*/
        return "done";
    }

    //bean class injecting userservice here
    public void setUserService(UserService userService) {
        this.userService = userService;
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

    }
