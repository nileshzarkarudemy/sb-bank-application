package com.eazybytes.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.accounts.constants.AccountsConstants;
import com.eazybytes.accounts.dto.ResponseDto;
import com.eazybytes.accounts.entity.Customer;


@RestController
@RequestMapping(path = "/api", produces = "application/json")
public class AccountsController {

    
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody Customer customer) {

        return ResponseEntity
               .status(HttpStatus.CREATED)
               .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }
}
