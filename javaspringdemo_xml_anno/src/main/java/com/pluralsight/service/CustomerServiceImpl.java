package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;


import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository custRepo;
    public CustomerServiceImpl()
    {

    }
    public CustomerServiceImpl(CustomerRepository custRepo)
    {
        this.custRepo = custRepo;
    }

    public List<Customer> findAll()
    {
        return custRepo.findAll();
    }
    public void setCustomerRepository(CustomerRepository custRepo) {
        this.custRepo = custRepo;
    }
}
