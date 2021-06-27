package com.andreygrosbelli.course.repositories;

import com.andreygrosbelli.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
