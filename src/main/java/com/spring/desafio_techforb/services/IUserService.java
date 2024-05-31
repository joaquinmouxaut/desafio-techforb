package com.spring.desafio_techforb.services;

import com.spring.desafio_techforb.persistence.entities.UserEntity;

import java.util.List;

public interface IUserService {

    public List<UserEntity> findAllUsers();
}
