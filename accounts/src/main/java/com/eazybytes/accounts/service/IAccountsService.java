package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Creates a new account for the customer and returns a response with status code 201
     * @param customerDto - data transfer object of type customer
     */
    void createAccount(CustomerDto customerDto);
}
