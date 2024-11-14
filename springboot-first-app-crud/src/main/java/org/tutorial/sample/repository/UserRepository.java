package org.tutorial.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tutorial.sample.model.User;


public interface UserRepository extends JpaRepository<User, Long>{

}