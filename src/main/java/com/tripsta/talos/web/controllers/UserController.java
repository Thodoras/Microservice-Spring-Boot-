package com.tripsta.talos.web.controllers;

import com.tripsta.talos.dto.UserDto.UserRequestDto;
import com.tripsta.talos.dto.UserDto.UserResponseDto;
import com.tripsta.talos.exceptions.ConstraintViolationException;
import com.tripsta.talos.persistence.entities.UserEntity;
import com.tripsta.talos.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(
            value = "/{id}",
            method = {RequestMethod.GET},
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @ResponseBody
    public UserRequestDto getUser(
            @PathVariable String id
    ) {
        return new UserRequestDto("bar", "foo");
    }

    @RequestMapping(
            method = {RequestMethod.POST},
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @ResponseBody
    public UserResponseDto createUser(
            @RequestBody UserRequestDto userRequestDto
    ) {
            return userService.createUser(userRequestDto);
    }
}
