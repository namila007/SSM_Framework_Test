package com.doerit.model;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class UserNames extends ActionSupport {
    private List<String> names;

    private List<UserJson> jsonname;

    private String name;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserJson> getJsonname() {
        return jsonname;
    }

    public void setJsonname(List<UserJson> jsonname) {
        this.jsonname = jsonname;
    }

    public String execute() {
        System.out.println(name + " << is the text");
        return "success";
    }
}
