package com.example.jdbc_practice.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue
    public int transactionId;
    public String msisdn;
    public String payerClientName;
    public String currencyCode;
    public Integer amountPaid;
}
