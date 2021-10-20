package com.marcossa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcossa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
