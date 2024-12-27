package com.marcosderlei.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosderlei.aula.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
