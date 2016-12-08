package com.tripsta.talos.service.utils;

import org.springframework.stereotype.Component;

@Component
public class UserUtil {

    private static final String SUCCESSFUL_WRITE_MESSAGE = "Successful write";

    public String getSuccessfulWriteMessage() {
        return SUCCESSFUL_WRITE_MESSAGE;
    }
}
