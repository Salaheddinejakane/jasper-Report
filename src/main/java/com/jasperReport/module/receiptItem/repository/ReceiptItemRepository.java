package com.jasperReport.module.receiptItem.repository;

import com.jasperReport.module.receiptItem.entity.ReceiptItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptItemRepository extends JpaRepository<ReceiptItem,Long> {
}
