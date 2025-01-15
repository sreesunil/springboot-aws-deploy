package com.abc.search.Services;


import com.abc.search.Models.Customer;
import com.abc.search.Models.Product;
import com.abc.search.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;


    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }




    @Override
    public Product addCustomer(Product product) {
        return customerRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return customerRepository.findAll();
    }
}
