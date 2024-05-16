package com.neonoaksweb.course.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neonoaksweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
