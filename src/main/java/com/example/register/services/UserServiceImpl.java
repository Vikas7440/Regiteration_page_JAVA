package com.example.register.services;

import com.example.register.entities.User;
import com.example.register.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices {
@Autowired
private UserRepository repository;

    @Override
    public User create(User user){
        return repository.save(user);
    }
}
