package com.finalProject.weatherApi.services;


import com.finalProject.weatherApi.entity.User;
import com.finalProject.weatherApi.repository.CityRepository;
import com.finalProject.weatherApi.repository.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository users;

    public List<User> getAll(){
        List<User> list = new ArrayList<>();
        this.users.findAll().forEach(list :: add);
        return list;
    }
    public Optional<User> get(int id){
        return this.users.findById(id);
    }

    public boolean save(User user){
        if(2 >= user.getNickName().length()){
            System.out.println("Nickname too short, try again");
            return false;
        }
        if(7 >= user.getPassword().length()){
            System.out.println("Password too short, please try again");
            return false;
        }
        this.users.save(user);
        return true;
    }
    public void update(User user){
        this.users.save(user);
    }
    public void delete(User user){
        this.users.delete(user);
    }
    public void deleteById(int id){
        this.users.deleteById(id);
    }

    public boolean login(User user){
        for (User dummy : this.users.findAll()) {
            if(dummy.getNickName().equalsIgnoreCase(user.getNickName()) && dummy.getPassword().equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }
}
