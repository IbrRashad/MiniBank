package com.company.minibank.minibankapplication.mapper;

import com.company.minibank.minibankapplication.dto.CustomerDto;
import com.company.minibank.minibankapplication.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {
    public CustomerDto converter(Customer customer) {
        CustomerDto customerDto = CustomerDto.builder()
                .name(customer.getName())
                .creditPercent(customer.getCreditPercent())
                .lastMonth(customer.getLastMonth())
                .month(customer.getMonth())
                .monthlyCredit(customer.getMonthlyCredit())
                .paidCredits(customer.getPaidCredits())
                .sumCredits(customer.getSumCredits())
                .build();
        return customerDto;
    }
}
