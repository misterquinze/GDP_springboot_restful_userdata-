package com.natsir.userdata.service;

import java.util.List;
import java.util.Optional;

import com.natsir.userdata.entity.Users;

import com.natsir.userdata.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    } 

    public Users getUserById(Long userId) {
        Optional<Users> user = usersRepository.findById(userId);

        if(user.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Oh No! I'm Sorry not found what you looking for");
        }
        return user.get();
    }
}
