package com.marcossa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcossa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem , Long>{

}
