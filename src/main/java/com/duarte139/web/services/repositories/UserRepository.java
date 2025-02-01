package com.duarte139.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duarte139.web.services.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
