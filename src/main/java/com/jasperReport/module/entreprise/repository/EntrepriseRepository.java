package com.jasperReport.module.entreprise.repository;

import com.jasperReport.module.entreprise.entity.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise,Integer> {
}
