package com.natsir.userdata.controller;

import java.util.List;

import com.natsir.userdata.entity.Users;
import com.natsir.userdata.service.UsersService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsersController {
    private UsersService usersService;


    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

}
