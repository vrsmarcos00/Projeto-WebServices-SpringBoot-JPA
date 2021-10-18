package com.marcossa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcossa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
