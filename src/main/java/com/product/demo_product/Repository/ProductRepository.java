package com.product.demo_product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.demo_product.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

