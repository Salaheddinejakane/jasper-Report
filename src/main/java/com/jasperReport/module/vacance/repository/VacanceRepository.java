package com.jasperReport.module.vacance.repository;

import com.jasperReport.module.vacance.entity.Vacance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacanceRepository extends JpaRepository<Vacance,Integer> {
}
