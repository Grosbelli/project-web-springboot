package com.andreygrosbelli.course.repositories;

import com.andreygrosbelli.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
