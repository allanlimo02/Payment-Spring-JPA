package com.example.jdbc_practice.service;

import com.example.jdbc_practice.dto.Payment;
import com.example.jdbc_practice.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private PaymentRepo paymentRepo;

    //Save single Payment to table
    public Payment savePayment(Payment payment){

        return paymentRepo.save(payment);
    }
    // save several Payment to Table
    public List<Payment> savePayments(List<Payment> payments){

        return paymentRepo.saveAll(payments);
    }
    // List all Payment
    public List <Payment> getPayments(){
        return paymentRepo.findAll();
    }
    //List payments by ID
    public Payment getPaymentById(int id){
        return paymentRepo.findById(id).orElse(null);
    }
    //Find by name
//    public Payment getPaymentByName(String name){
//        return paymentRepo.findByName(name).orElse(null);
//    }
    public String deletePayment(int id){
         paymentRepo.deleteById(id);
        return "Payment with Id "+id+" removed successfully";
    }

// Updating the payment
    public Payment updatePayment(Payment payment){
        Payment existingPayment=paymentRepo.findById(payment.getTransactionId()).orElse(null);
        existingPayment.setTransactionId(payment.transactionId);
        existingPayment.setMsisdn(payment.getMsisdn());
        existingPayment.setAmountPaid(payment.getAmountPaid());
        existingPayment.setCurrencyCode(payment.getCurrencyCode());
        existingPayment.setPayerClientName(payment.getPayerClientName());
        return paymentRepo.save(existingPayment);
    }

}
