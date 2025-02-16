package com.duarte139.web.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duarte139.web.services.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
	