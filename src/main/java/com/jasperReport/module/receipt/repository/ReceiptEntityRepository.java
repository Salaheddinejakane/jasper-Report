package com.jasperReport.module.receipt.repository;

import com.jasperReport.module.receipt.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptEntityRepository extends JpaRepository<Receipt,Long> {
}
