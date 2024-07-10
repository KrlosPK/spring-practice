package com.casa_dragon.services;

import com.casa_dragon.models.Aliado;
import com.casa_dragon.models.Dragon;
import com.casa_dragon.repositories.AliadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AliadoServiceImpl implements IAliadoService {

    @Autowired
    private AliadoRepository aliadoRepository;

    @Override
    public Aliado addAliado (Aliado aliado) throws Exception {
        try {
            return aliadoRepository.save(aliado);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public List<Aliado> listAliados() throws Exception {
        try {
            return (List<Aliado>) aliadoRepository.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

}
