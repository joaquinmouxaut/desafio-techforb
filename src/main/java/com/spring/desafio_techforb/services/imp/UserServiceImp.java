package com.spring.desafio_techforb.services.imp;

import com.spring.desafio_techforb.persistence.entities.UserEntity;
import com.spring.desafio_techforb.persistence.repositories.UserRepository;
import com.spring.desafio_techforb.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserEntity> findAllUsers(){
        return userRepository.findAll();
    }
}