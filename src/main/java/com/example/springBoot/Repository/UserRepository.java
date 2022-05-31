package com.example.springBoot.Repository;

import com.example.springBoot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends JpaRepository<User,Long> {



}
