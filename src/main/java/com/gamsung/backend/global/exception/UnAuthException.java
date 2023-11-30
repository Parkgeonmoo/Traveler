package com.gamsung.backend.global.exception;

import lombok.Getter;
import org.springframework.security.access.AccessDeniedException;

@Getter
public class UnAuthException extends AccessDeniedException {
    private final ErrorCode errorCode;
    
    public UnAuthException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public String getCode() {
        return errorCode.getCode();
    }

}