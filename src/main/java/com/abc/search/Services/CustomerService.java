package com.abc.search.Services;

import com.abc.search.Models.Customer;
import com.abc.search.Models.Product;

import java.util.List;

public interface CustomerService {


     Product addCustomer(Product product);
     List<Product> getAllProducts();
}
