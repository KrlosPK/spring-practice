package com.casa_dragon.services;

import com.casa_dragon.models.Dragon;
import com.casa_dragon.models.Jinete;
import com.casa_dragon.repositories.JineteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JineteServiceImpl implements IJineteService {

    @Autowired
    private JineteRepository jineteRepository;

    @Override
    public Jinete addJinete (Jinete jinete) throws Exception {
        try {
            return jineteRepository.save(jinete);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public List<Jinete> listJinetes() throws Exception {
        try {
            return (List<Jinete>) jineteRepository.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

}
