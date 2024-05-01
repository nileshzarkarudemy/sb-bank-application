package com.eazybytes.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eazybytes.accounts.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
   // There are many method in this interface
   
}
