package com.cdr.minicdr.repository;

import com.cdr.minicdr.model.CDR;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CDRRepository extends JpaRepository<CDR, Long> {
    List<CDR> findByaNumber(String aNumber);
    List<CDR> findBybNumber(String bNumber);
}
