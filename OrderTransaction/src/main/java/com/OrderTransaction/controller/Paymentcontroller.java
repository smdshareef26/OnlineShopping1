package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Payment;
import com.app.repository.Paymentrepository;



@RestController
public class Paymentcontroller {
	/*Paymentservice ps;
    
    @GetMapping("/payment")
    public List<Payment> prodlist()
    {
    	return ps.prodlist();
    }    */
@Autowired
private Paymentrepository Paymentrepository;

@GetMapping("/payment")
 public List<Payment> getAllpayment() {
    return Paymentrepository.findAll();
}


@PostMapping("/payment")
public Payment createPayment(@Valid @RequestBody Payment payment) {
    return Paymentrepository.save(payment);
}
    
    
}
