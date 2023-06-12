package com.example.projectrentproucts.repository;

import com.example.projectrentproucts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProjectJpaRepository extends JpaRepository<Product, Long> {
    List<Product> findByStartDateLessThanEqualAndEndDateGreaterThanEqual(LocalDate endDate, LocalDate startDate);
}

