package com.product.demo_product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.demo_product.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
