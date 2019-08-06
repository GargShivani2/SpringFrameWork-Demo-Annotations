package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
   // @Autowired
    private CustomerRepository custRepo;

    public CustomerServiceImpl()
    {

    }
    @Autowired
    public CustomerServiceImpl(CustomerRepository custRepo)
    {
        System.out.println("We are using constructor injection");
        this.custRepo = custRepo;
    }

   // @Autowired
    public void setCustomerRepository(CustomerRepository custRepo) {
        System.out.println("We are using setter injection");
        this.custRepo = custRepo;
    }
    public List<Customer> findAll()
    {
        return custRepo.findAll();
    }

}
