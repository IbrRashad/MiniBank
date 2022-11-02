package com.company.minibank.minibankapplication.service;


import com.company.minibank.minibankapplication.dto.CustomerDto;
import com.company.minibank.minibankapplication.dto.response.CustomerResponse;

public interface CustomerService {
    CustomerResponse getAllCustomer();
    CustomerDto findUserById(int id);
}