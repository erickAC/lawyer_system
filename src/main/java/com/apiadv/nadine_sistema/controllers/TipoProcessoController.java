package com.apiadv.nadine_sistema.controllers;

import com.apiadv.nadine_sistema.models.TipoProcesso;
import com.apiadv.nadine_sistema.repositories.TipoProcessoRepository;
import com.apiadv.nadine_sistema.services.TipoProcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tipo-processo")
public class TipoProcessoController implements Serializable {

    @Autowired
    private TipoProcessoService tipoProcessoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TipoProcesso> findAll() {
        return tipoProcessoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TipoProcesso create(@RequestBody TipoProcesso tipoProcesso) {
        return tipoProcessoService.create(tipoProcesso);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TipoProcesso findById(@PathVariable Integer id) {
        return tipoProcessoService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id) {
        if(tipoProcessoService.findById(id)) {
            tipoProcessoService.delete(id);
        }
    }
}
