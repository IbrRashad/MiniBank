package com.company.minibank.minibankapplication.service.impl;

import com.company.minibank.minibankapplication.dto.CustomerDto;
import com.company.minibank.minibankapplication.dto.response.CustomerResponse;
import com.company.minibank.minibankapplication.enums.ErrorCodeEnum;
import com.company.minibank.minibankapplication.exception.CustomerNotFound;
import com.company.minibank.minibankapplication.mapper.CustomerDtoConverter;
import com.company.minibank.minibankapplication.repository.CustomerRepository;
import com.company.minibank.minibankapplication.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerDtoConverter customerDtoConverter;

    @Override
    public CustomerResponse getAllCustomer() {
        List<CustomerDto> customerList = customerRepository.findAll()
                .stream()
                .map(customerDtoConverter::converter)
                .collect(Collectors.toList());

        return CustomerResponse.builder()
                .dtoList(customerList)
                .build();
    }

    @Override
    public CustomerDto findUserById(int id) {
        return customerRepository.findById(id).map(customerDtoConverter
        ::converter).orElseThrow(()-> new CustomerNotFound(ErrorCodeEnum.CUSTOMER_NOT_FOUND));
    }


}
