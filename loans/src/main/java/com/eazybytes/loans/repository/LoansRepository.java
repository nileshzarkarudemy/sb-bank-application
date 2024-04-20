package com.eazybytes.loans.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.loans.model.Loans;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Integer> {
    java.util.List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);
}
