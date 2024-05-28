package com.neonoaksweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neonoaksweb.course.entities.OrderItem;
import com.neonoaksweb.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
