package com.apiadv.nadine_sistema.repositories;

import com.apiadv.nadine_sistema.models.TipoProcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProcessoRepository extends JpaRepository<TipoProcesso, Integer> {



}