package com.logrex.easybank.repository;

import com.logrex.easybank.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface LoanRepository extends CrudRepository <Loans,Long>{

    List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);
}