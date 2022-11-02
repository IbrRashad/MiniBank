package com.company.minibank.minibankapplication.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic()
    @Column(name = "name")
    private String name;
    @Basic()
    @Column(name = "sum_credits")
    private Double sumCredits;
    @Basic
    @Column(name = "paid_credits")
    private Double paidCredits;
    @Basic
    @Column(name = "credit_percent")
    private Double creditPercent;
    @Basic
    @Column(name = "monthly_credit")
    private Integer monthlyCredit;
    @Basic
    @Column(name = "last_month")
    private Double lastMonth;
    @Basic
    @Column(name = "month")
    private Integer month;

}
