package com.tripsta.talos.service.converters;

import com.tripsta.talos.dto.UserDto.UserRequestDto;
import com.tripsta.talos.dto.UserDto.UserResponseDto;
import com.tripsta.talos.persistence.entities.UserEntity;
import com.tripsta.talos.service.utils.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    @Autowired
    private UserUtil userUtil;

    public UserEntity convertUserRequestDtoToUserEntity(UserRequestDto userRequestDto) {
        return new UserEntity(
               userRequestDto.getEmail(),
               userRequestDto.getPassword()
        );
    }

    public UserResponseDto convertUserEntiryToUserResponseDto(UserEntity userEntity) {
        return new UserResponseDto(
                userEntity.getEmail(),
                userEntity.getPassword(),
                userUtil.getSuccessfulWriteMessage()
        );
    }
}
