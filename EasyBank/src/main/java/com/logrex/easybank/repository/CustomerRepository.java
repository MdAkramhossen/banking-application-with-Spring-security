package com.logrex.easybank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.logrex.easybank.model.Customer;


import java.util.List;

@Repository
public interface CustomerRepository  extends CrudRepository<Customer, Long> {

    List<Customer> findByEmail(String email);
}
