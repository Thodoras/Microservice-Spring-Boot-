package com.tripsta.talos.services.impl;

import com.tripsta.talos.exceptions.ConstraintViolationException;
import com.tripsta.talos.persistence.entities.UserEntity;
import com.tripsta.talos.persistence.repositories.UserRepository;
import com.tripsta.talos.services.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
@EnableTransactionManagement
public class UserServiceImpl implements UserService {

    private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public UserEntity createUser(String email, String password)
            throws ConstraintViolationException {

        if (email == null || password == null) {
            log.error("Not nullable attribute was assigned null value");
            throw new ConstraintViolationException(null, "Not nullable attribute was assigned null value");
        }

        UserEntity user = new UserEntity();
        user.setEmail(email);
        user.setPassword(password);
        userRepository.save(user);
        log.debug("User: " + user + " persisted in database");
        return user;
    }

    @Override
    public UserEntity retrieveUser(Long id) {
        log.debug("Invoking retrieveUser with id: {}" + id);
        UserEntity user = userRepository.findById(id);
        return user;
    }
}
