package com.sbm.spring_rds.repository;

import com.sbm.spring_rds.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}