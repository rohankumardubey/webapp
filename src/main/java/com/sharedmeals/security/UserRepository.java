package com.sharedmeals.security;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public User findOneByEmail(String email);
	
	public void deleteByEmail(String email);
}