package com.jasperReport.module.conge.repository;

import com.jasperReport.module.conge.entity.Conge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongeRepository extends JpaRepository<Conge,Integer> {
}
