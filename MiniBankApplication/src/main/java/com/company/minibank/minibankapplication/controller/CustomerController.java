package com.company.minibank.minibankapplication.controller;

import com.company.minibank.minibankapplication.dto.CustomerDto;
import com.company.minibank.minibankapplication.dto.response.CustomerResponse;
import com.company.minibank.minibankapplication.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/minibank")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customers")
    @CrossOrigin("3600")
    public ResponseEntity<CustomerResponse> getAllCustomer() {
        return ResponseEntity.ok(customerService.getAllCustomer());
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<CustomerDto> findByCustomerId(@PathVariable int id) {
        return ResponseEntity.ok(customerService.findUserById(id));
    }

}
