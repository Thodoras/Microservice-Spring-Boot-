package com.tripsta.talos.services;

import com.tripsta.talos.exceptions.ConstraintViolationException;
import com.tripsta.talos.persistence.entities.UserEntity;

public interface UserService {

    UserEntity createUser(String email, String password)
            throws ConstraintViolationException;

    UserEntity retrieveUser(Long id);
}