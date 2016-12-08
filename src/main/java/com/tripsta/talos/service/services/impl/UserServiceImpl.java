package com.tripsta.talos.service.services.impl;

import com.tripsta.talos.dto.UserDto.UserRequestDto;
import com.tripsta.talos.dto.UserDto.UserResponseDto;
import com.tripsta.talos.exceptions.ConstraintViolationException;
import com.tripsta.talos.persistence.entities.UserEntity;
import com.tripsta.talos.persistence.repositories.UserRepository;
import com.tripsta.talos.service.converters.UserConverter;
import com.tripsta.talos.service.services.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {

    private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        UserEntity userEntity = userConverter.convertUserRequestDtoToUserEntity(userRequestDto);
        userRepository.save(userEntity);
        log.debug("User: " + userEntity + " persisted in database");
        return userConverter.convertUserEntiryToUserResponseDto(userEntity);
    }

}
