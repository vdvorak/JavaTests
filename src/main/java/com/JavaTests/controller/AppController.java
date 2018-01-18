package com.JavaTests.controller;

import com.JavaTests.dao.impl.TopicComponentImpl;
import com.JavaTests.entity.Role;
import com.JavaTests.entity.Topic;
import com.JavaTests.entity.User;
import com.JavaTests.model.RoleModel;
import com.JavaTests.service.RoleService;
import com.JavaTests.service.impl.Example;

import com.JavaTests.service.impl.TopicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;


@Controller
public class AppController {

    @Autowired
    Example example;

    @Autowired
    RoleModel roleModel;

    @Autowired
    TopicServiceImpl topicServiceImpl;

    @RequestMapping("/")
    public String hello() {
        return "hello2";
    }

//    @RequestMapping(value = "/role/{rolePeople}", method = RequestMethod.GET)
//    @ResponseBody
//    public Role getRole(@PathVariable(value = "rolePeople") String rolePeople) {
//        return roleServiceImpl.getRole(Integer.parseInt(rolePeople));
//    }

/*    @RequestMapping(value = "/getRole/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Role getRole(@PathVariable int id) {
        return roleServiceImpl.getRole(id);
    }*/

//    @RequestMapping(value = "/getUsers/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
//    public ArrayList<User> getRole(@PathVariable int id) {
//        System.out.println("User : " + id);
//        return (ArrayList<User>) example.getUsers();
//    }

    @RequestMapping(value = "/getTheme/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public ArrayList<Topic> getTheme(@PathVariable int id) {
        System.out.println("Theme : " + id);
        return (ArrayList<Topic>) topicServiceImpl.getTheme();
    }

//    @RequestMapping(value = "/getRole")
//    public String getRole(Model model) {
//        model.addAttribute("rolePeople", roleServiceImpl.getRole());
//        return "role";
//    }



}
