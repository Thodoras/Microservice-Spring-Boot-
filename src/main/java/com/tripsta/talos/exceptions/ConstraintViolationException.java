package com.tripsta.talos.exceptions;

public class ConstraintViolationException extends BusinessException {

    public ConstraintViolationException() {

    }

    public ConstraintViolationException(Long errorCode, String errorDescription) {
        super(errorCode, errorDescription);
    }

}
