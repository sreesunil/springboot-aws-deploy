package com.abc.search.Repository;
import com.abc.search.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Product, Long> {
}
