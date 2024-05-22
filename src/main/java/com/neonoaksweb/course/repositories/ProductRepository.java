package com.neonoaksweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neonoaksweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
