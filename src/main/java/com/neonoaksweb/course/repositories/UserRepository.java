package com.neonoaksweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neonoaksweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
