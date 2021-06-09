package com.chayugadesigns.repository;

import com.chayugadesigns.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDTO extends CrudRepository<Customer, Integer> {
}
