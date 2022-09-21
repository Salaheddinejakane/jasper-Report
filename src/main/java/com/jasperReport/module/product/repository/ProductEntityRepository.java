package com.jasperReport.module.product.repository;

import com.jasperReport.module.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductEntityRepository extends JpaRepository<Product,Long> {
}
