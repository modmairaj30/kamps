package com.kamps.payments.services;



import com.kamps.payments.models.Payment;

import com.kamps.payments.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    /*@Override
    public Payment getPaymentById(Integer id) {
        return paymentRepository.findById(id).orElse(null);
    }



    @Override
    public void deletePayment(Integer id) {
        paymentRepository.deleteById(id);
    }*/
}

