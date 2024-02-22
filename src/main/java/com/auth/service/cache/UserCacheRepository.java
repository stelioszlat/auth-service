package com.auth.service.cache;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<String, User> {
}
