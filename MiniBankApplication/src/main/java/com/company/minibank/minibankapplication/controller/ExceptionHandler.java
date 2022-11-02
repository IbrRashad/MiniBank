package com.company.minibank.minibankapplication.controller;

import com.company.minibank.minibankapplication.dto.response.ErrorResponse;
import com.company.minibank.minibankapplication.exception.CustomerNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(CustomerNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleCustomerNotFound(CustomerNotFound customerNotFound) {
        return ErrorResponse.builder()
                .code(customerNotFound.getCode())
                .message(customerNotFound.getMessage())
                .build();
    }


}
