package com.apiadv.nadine_sistema.tests;

import com.apiadv.nadine_sistema.models.Processo;
import com.apiadv.nadine_sistema.models.TipoProcesso;
import com.apiadv.nadine_sistema.repositories.ProcessoRepository;
import com.apiadv.nadine_sistema.repositories.TipoProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.sql.SQLException;
import java.time.LocalDate;

@Profile("test")
public class InstanciaBD {

    @Autowired
    private TipoProcessoRepository tipoProcessoRepository;

    public void  instanciaDB() {
//        Processo processo1 = new Processo(1, "Erick", LocalDate.of(2022, 12, 12),LocalDate.of(2022, 12, 12), LocalDate.of(2022, 12, 12));

//        repository.save(processo1);

        TipoProcesso tipoProcesso = new TipoProcesso(1, "Juridico");

        System.out.println(tipoProcesso.toString());
        tipoProcessoRepository.save(tipoProcesso);

    }

}
