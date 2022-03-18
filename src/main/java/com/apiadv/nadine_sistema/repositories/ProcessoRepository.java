package com.apiadv.nadine_sistema.repositories;

import com.apiadv.nadine_sistema.models.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Integer> {
}
