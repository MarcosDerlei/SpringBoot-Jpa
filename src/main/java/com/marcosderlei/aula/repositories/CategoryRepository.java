package com.marcosderlei.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosderlei.aula.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
