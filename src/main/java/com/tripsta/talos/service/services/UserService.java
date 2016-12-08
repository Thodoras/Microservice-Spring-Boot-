package com.tripsta.talos.service.services;

import com.tripsta.talos.dto.UserDto.UserRequestDto;
import com.tripsta.talos.dto.UserDto.UserResponseDto;
import com.tripsta.talos.exceptions.ConstraintViolationException;
import com.tripsta.talos.persistence.entities.UserEntity;

public interface UserService {

    UserResponseDto createUser(UserRequestDto userRequestDto);

}