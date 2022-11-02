package com.company.minibank.minibankapplication.dto.response;

import com.company.minibank.minibankapplication.dto.CustomerDto;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class CustomerResponse {
    public List<CustomerDto> dtoList;
}

