package com.marcossa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcossa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
