package com.marcossa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcossa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
