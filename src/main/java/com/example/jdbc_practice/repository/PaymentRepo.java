package com.example.jdbc_practice.repository;

import com.example.jdbc_practice.dto.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepo extends JpaRepository<Payment,Integer> {

    Optional<Object> findByName(String name);
}
