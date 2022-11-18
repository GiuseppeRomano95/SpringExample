package com.example.SpringExample.controllers;

import com.example.SpringExample.entities.Customer;
import com.example.SpringExample.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/customers")
public class CustomerController {
  private final CustomerRepository customerRepo;
  @Autowired
  public CustomerController(CustomerRepository customerRepository){
      this.customerRepo=customerRepository;
  }
  @GetMapping
  public Iterable<Customer> getAllCustomers(){
      var customers = customerRepo.findAll();
      return customers;
  }
}
