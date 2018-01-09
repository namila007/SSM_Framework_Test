package com.doerit.model;

import com.doerit.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class UserNames extends ActionSupport {
    private List<String> names;
    private UserService userService;


    private List<UserJson> jsonname;

    private String name;

   /* public UserService getUserService() {
        return userService;
    }*/

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

   /* public String getName() {
        return name;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public List<UserJson> getJsonname() {
        return jsonname;
    }

    /*public void setJsonname(List<UserJson> jsonname) {
        this.jsonname = jsonname;
    }
*/
    public String execute() {
        result();
        System.out.println(name + " << is the text");
        return "success";
    }

    public void result(){
        //term = userNames.getName();

        System.out.println(name + " <<<THIS IS TYPED");
        //names = userService.getNames(name);


        // userNames.setNames(names);
        System.out.println("*****************");
        System.out.printf(userService.getNames(name).toString() + " This is the list");
        names = getNamesonly(userService.getNames(name));
       // userNames.setNames(namelist);
    }

    private List<String> getNamesonly(List<User> names1) {
        List<String> list = new ArrayList<>();

        for (int n = 0; n < names1.size(); n++) {
            User user = (User) names1.get(n);
            list.add(user.getName());
        }
        return list;
    }

}
