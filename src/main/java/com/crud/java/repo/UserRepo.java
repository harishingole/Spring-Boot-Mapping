package com.crud.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.java.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
