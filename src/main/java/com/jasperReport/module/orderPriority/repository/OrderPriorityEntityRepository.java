package com.jasperReport.module.orderPriority.repository;

import com.jasperReport.module.orderPriority.entity.OrderPriority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderPriorityEntityRepository extends JpaRepository<OrderPriority,Long> {
}
