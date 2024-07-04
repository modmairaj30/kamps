package com.kamps.payments.services;



import com.kamps.payments.models.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> getAllPayments();
   //Payment getPaymentById(Integer id);
    Payment createPayment(Payment payment);
    //void deletePayment(Integer id);*/
}

