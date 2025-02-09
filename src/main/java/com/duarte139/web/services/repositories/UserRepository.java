package com.duarte139.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duarte139.web.services.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
