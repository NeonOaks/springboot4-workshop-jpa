package com.neonoaksweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neonoaksweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
