package com.finalProject.weatherApi.controllers;


import com.finalProject.weatherApi.entity.User;
import com.finalProject.weatherApi.services.UserServices;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/users/user")
    public int getUser(@RequestBody User user){
        if(this.userServices.login(user)){
            return Response.SC_OK;
        }
        return Response.SC_NOT_FOUND;
    }

    @PostMapping("/users/user")
    public int registerUser(@RequestBody User user){
        if(this.userServices.save(user)){
            return Response.SC_CREATED;
        }
        return Response.SC_NOT_ACCEPTABLE;
    }

}
