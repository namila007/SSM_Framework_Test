package com.doerit.action;

import com.doerit.model.User;
import com.doerit.model.UserNames;
import com.doerit.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import javax.xml.ws.Action;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AjaxAutoComplete extends ActionSupport {

    private UserNames userNames;
    private UserService userService;
    private String name;
    private List<User> names = new ArrayList<>();

    //for ajax get
    private String term;
    private List<String> newnames;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public List<String> getNewnames() {
        return newnames;
    }

    public void setNewnames(List<String> newnames) {
        this.newnames = newnames;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getNames() {
        return names;
    }

    public void setNames(List<User> names) {
        this.names = names;
    }


    public String setCombo() {

        /*name = userNames.getName();
        name="nam";
        System.out.println(name + " <<<THIS IS TYPED");
        names = userService.getNames(name);


        // userNames.setNames(names);
        System.out.println("*****************");
        System.out.printf(names.toString() + " This is the list");
        newnames = getNamesonly(userService.getNames(name));
        userNames.setNames(newnames);*/
        return "success";

    }

    private List<String> getNamesonly(List<User> names1) {
        List<String> list = new ArrayList<>();

        for (int n = 0; n < names1.size(); n++) {
            User user = (User) names1.get(n);
            list.add(user.getName());
        }
        return list;
    }

    public UserNames getUserNames() {
        return userNames;
    }

    public void setUserNames(UserNames userNames) {
        this.userNames = userNames;
    }
}
