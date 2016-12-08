package com.tripsta.talos.exceptions;

public class BusinessException extends Exception {

    private Long errorCode;

    private String errorDescription;

    public BusinessException() {

    }

    public BusinessException(Long errorCode, String errorDescription) {
        super();
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    public BusinessException(Long errorCode, String errorDescription, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    public BusinessException(Long errorCode, String errorDescription, String message) {
        super(message);
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    public BusinessException(Long errorCode, String errorDescription, Throwable cause, String message) {
        super(message, cause);
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BusinessException [errorCode=");
        builder.append(errorCode);
        builder.append(", errorDescription=");
        builder.append(errorDescription);
        builder.append("]");
        return builder.toString();
    }

}
