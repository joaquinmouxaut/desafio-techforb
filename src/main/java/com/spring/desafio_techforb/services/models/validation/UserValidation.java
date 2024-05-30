package com.spring.desafio_techforb.services.models.validation;

import com.spring.desafio_techforb.persistence.entities.UserEntity;
import com.spring.desafio_techforb.services.models.dtos.ResponseDTO;

public class UserValidation {
    public ResponseDTO validate(UserEntity user) {
        ResponseDTO response = new ResponseDTO();

        response.setNumOfErrors(0);

        if (user.getUser() == null ||
            user.getUser().length() < 3 ||
            user.getUser().length() > 40
        ) {
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("Nombre de usuario incorrecto");
        }

        if (user.getEmail() == null ||
                !user.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
        ) {
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("Email de usuario incorrecto");
        }

        if (user.getPassword() == null ||
                !user.getPassword().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,16}$")
        ) {
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("Contraseña de usuario incorrecta");
        }

        return response;
    }
}
