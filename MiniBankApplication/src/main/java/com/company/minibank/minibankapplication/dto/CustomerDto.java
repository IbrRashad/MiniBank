package com.company.minibank.minibankapplication.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {
    private String name;
    private Double sumCredits;
    private Double paidCredits;
    private Double creditPercent;
    private Integer monthlyCredit;
    private Double lastMonth;
    private Integer month;
}
