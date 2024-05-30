package com.spring.desafio_techforb.services;

import com.nimbusds.jose.JOSEException;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public interface IJWTUtilityService {
    public String generateJWT(Long userId) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, JOSEException;
}
