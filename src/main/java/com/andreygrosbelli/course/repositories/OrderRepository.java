package com.andreygrosbelli.course.repositories;

import com.andreygrosbelli.course.entities.Order;
import com.andreygrosbelli.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
