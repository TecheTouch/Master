package com.techetouch.master.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techetouch.master.config.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findUsersByUsernameAndPassword(String u, String p);
}