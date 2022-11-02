package com.company.minibank.minibankapplication.exception;

import com.company.minibank.minibankapplication.enums.ErrorCodeEnum;
import lombok.Getter;

@Getter
public class CustomerNotFound extends RuntimeException {
    private final int code;
    private  final String message;

    public CustomerNotFound(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.message = errorCodeEnum.getMessage();
        this.code = errorCodeEnum.getCode();
    }
}
