package com.marcosderlei.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosderlei.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
