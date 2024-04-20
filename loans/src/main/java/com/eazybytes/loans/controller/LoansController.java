package com.eazybytes.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.loans.exceptions.LoanNotFoundException;
import com.eazybytes.loans.model.Customer;
import com.eazybytes.loans.model.Loans;
import com.eazybytes.loans.repository.LoansRepository;

@RestController
public class LoansController {
    
    @Autowired 
    private LoansRepository loansRepository;

    @PostMapping("/myLoans")
    public List<Loans> getLoans(@RequestBody Customer customer) {
        List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
        if (loans == null) {
            throw new LoanNotFoundException("Loans not found for customer " + customer.getCustomerId());
        }
        return loans;
    }
}
