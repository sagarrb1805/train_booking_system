package com.example.train.Services;

import com.example.train.Models.User;
import com.example.train.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private IUserRepo userRepo;

    public User addUser(User user){
        userRepo.save(user);
        return user;
    }
    public Optional<User> getUser(int id){
        return userRepo.findById(id);

    }
}
