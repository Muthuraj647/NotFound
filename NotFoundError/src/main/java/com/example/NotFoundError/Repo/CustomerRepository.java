package com.example.NotFoundError.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NotFoundError.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
