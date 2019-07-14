package com.example.test.Resource;

import com.example.test.Repository.UserRepository;
import com.example.test.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserRepository er;

    @GetMapping(produces = "application/json")
    public @ResponseBody
    Iterable<User> ListUser(){
        Iterable<User> listUsers = er.findAll();
        return listUsers;
    }

    @PostMapping()
    public User newUser(@RequestBody @Valid User user){
        return er.save(user);
    }

    @DeleteMapping()
    public User deleteUser(@RequestBody User user){
        er.delete(user);
        return user;
    }

}
