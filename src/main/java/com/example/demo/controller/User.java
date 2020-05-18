package com.example.demo.controller;

import com.example.demo.Impleentations.UserservicesImpn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class User {
    @Autowired
    private UserservicesImpn userservicesImpn;

    @GetMapping("/all")
    public String allusers(){
        return userservicesImpn.getallUsers();
    }

}
