package com.spring.desafio_techforb.services;

import com.spring.desafio_techforb.services.models.dtos.LoginDTO;
import com.spring.desafio_techforb.persistence.entities.UserEntity;
import com.spring.desafio_techforb.services.models.dtos.ResponseDTO;

import java.util.HashMap;

public interface IAuthService {

    public HashMap<String, String> login(LoginDTO loginRequest) throws Exception;
    public ResponseDTO register(UserEntity user) throws Exception;
}
