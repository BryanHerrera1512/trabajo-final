package com.bryan.ms_ordenes.repository;

import com.bryan.ms_ordenes.entity.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
}
