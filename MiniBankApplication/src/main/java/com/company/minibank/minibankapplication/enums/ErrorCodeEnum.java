package com.company.minibank.minibankapplication.enums;

import lombok.Getter;

@Getter
public enum ErrorCodeEnum {
    CUSTOMER_NOT_FOUND(100, "User not found ");
    private final int code;
    private final String message;

    ErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
