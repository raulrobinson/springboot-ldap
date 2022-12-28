/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samaddico.springboot.ldap.controller;

import com.samaddico.springboot.ldap.model.UserModel;
import com.samaddico.springboot.ldap.repository.ApacheDSRepository;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class AppController {

    Logger logger = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private ApacheDSRepository apacheDSRepository;

    //@Autowired
    //private PersonRepository personRepository;

    @ResponseBody
    @GetMapping("/users")
    public Iterable<UserModel> getAllUsers() {
        Iterable<UserModel> res = apacheDSRepository.findAll();
        //logger.info(res.toString().strip());
        return res;
    }

    /*@ResponseBody
    @GetMapping("/id")
    public List<Person> getById(String user) {
        return personRepository.getPersonNamesByLastName(user);
    }*/
    
    @RequestMapping(value = "/login")
    public String login() {
        return "signin";
    }
    
    @RequestMapping(value = "/home")
    public String home() {
        return "index";
    }
    
    @RequestMapping(value = "/")
    public String home1() {
        return "index";
    }
}
