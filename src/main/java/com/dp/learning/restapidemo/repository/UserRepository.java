package com.dp.learning.restapidemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dp.learning.restapidemo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
