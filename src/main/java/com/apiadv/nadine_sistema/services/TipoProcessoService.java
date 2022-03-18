package com.apiadv.nadine_sistema.services;

import com.apiadv.nadine_sistema.models.TipoProcesso;
import com.apiadv.nadine_sistema.repositories.TipoProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoProcessoService {

    @Autowired
    private TipoProcessoRepository tipoProcessoRepository;

    public List<TipoProcesso> findAll() {
        return tipoProcessoRepository.findAll();
    }

    public TipoProcesso create(TipoProcesso tipoProcesso) {
        return tipoProcessoRepository.save(tipoProcesso);
    }

    public TipoProcesso findById(Integer id) {
        return tipoProcessoRepository.findById(id).get();
    }

    public void delete(Integer id) {
        tipoProcessoRepository.deleteById(id);
    }
}
