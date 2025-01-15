package com.abc.search.Controller;


import com.abc.search.Models.Customer;
import com.abc.search.Models.Product;
import com.abc.search.Services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    private final CustomerService customerService;

    public SampleController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/search")
    public String getSearch(){

        return "Hello There";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return customerService.getAllProducts();
    }



    @PostMapping("/products")
    public Product addProducts(@RequestBody Product product){

        return customerService.addCustomer(product);
    }
}
