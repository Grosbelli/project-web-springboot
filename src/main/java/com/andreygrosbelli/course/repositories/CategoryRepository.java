package com.andreygrosbelli.course.repositories;

import com.andreygrosbelli.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
