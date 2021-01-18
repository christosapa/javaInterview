package com.javaInterview.javaInterview.repositories;

import com.javaInterview.javaInterview.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
