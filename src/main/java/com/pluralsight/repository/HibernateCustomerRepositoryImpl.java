package com.pluralsight.repository;
import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository("customerRepository")
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
