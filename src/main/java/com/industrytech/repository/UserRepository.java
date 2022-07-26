package com.industrytech.repository;

import com.industrytech.users.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT u FROM User u WHERE u.email = :email and u.password = :password")
    User findByLogin(String email, String password);
}
