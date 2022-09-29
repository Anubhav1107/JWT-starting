package com.springrest.springrest.dao;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Users;


public interface UserRepo extends JpaRepository<Users, Long>
{
    public Optional<Users> findByEmail(String email);
}