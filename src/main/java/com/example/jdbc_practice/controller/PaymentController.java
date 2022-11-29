package com.example.jdbc_practice.controller;

import com.example.jdbc_practice.dto.Payment;
import com.example.jdbc_practice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/addpayment")
    public Payment addPayment(@RequestBody Payment payment){

        return paymentService.savePayment(payment);
    }

    @RequestMapping("/addpayments")
    public List<Payment> addPayments(@RequestBody List <Payment> payments){

        return paymentService.savePayments(payments);
    }

    @RequestMapping("/getpayments")
    public List <Payment> getPayments(@RequestBody List <Payment> payments ){
        return paymentService.getPayments(payments);
    }

    @RequestMapping("/getPaymentById/{id}")
    public Payment getPaymentById(@PathVariable int id){
        return paymentService.getPaymentById(id);
    }


    @PutMapping("/update")
    public Payment updatePayment(Payment payment){
        return paymentService.updatePayment(payment);
    }
    @DeleteMapping("/deletePayment/{id}")
    public String deletePayment(@PathVariable int id){
        return paymentService.deletePayment(id);
    }
}
;