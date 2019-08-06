package com.pluralsight.repository;
import com.pluralsight.model.Customer;

import java.util.*;
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll()
    {
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setFirstName("Shivani");
        customer1.setLastName("Garg");
        customers.add(customer1);
        return customers;
    }


}
