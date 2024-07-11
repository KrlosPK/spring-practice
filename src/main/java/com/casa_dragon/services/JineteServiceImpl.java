package com.casa_dragon.services;

import com.casa_dragon.helpers.ServiceMessage;
import com.casa_dragon.models.Aliado;
import com.casa_dragon.models.Jinete;
import com.casa_dragon.repositories.JineteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Jinete listJineteById(Integer jineteId) throws Exception {
        try {
            Optional<Jinete> jineteOptional = jineteRepository.findById(jineteId);

            if (jineteOptional.isPresent()) {
                return jineteOptional.get();
            } else {
                throw new Exception(ServiceMessage.JINETE_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Jinete updateJinete(Integer jineteId, Jinete newJinete) throws Exception {
        try {
            Optional<Jinete> jineteOptional = jineteRepository.findById(jineteId);

            if (jineteOptional.isPresent()) {
                Jinete jinete = jineteOptional.get();

                jinete.setEdad(newJinete.getEdad());
                jinete.setNombres(newJinete.getNombres());
                jinete.setFechaMontura(newJinete.getFechaMontura());

                return jineteRepository.save(jinete);
            } else {
                throw new Exception(ServiceMessage.ALIADO_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Boolean deleteJinete(Integer jineteId) throws Exception {
        try {
            Optional<Jinete> jineteOptional = jineteRepository.findById(jineteId);

            if (jineteOptional.isPresent()) {
                jineteRepository.deleteById(jineteId);
                return true;
            } else {
                throw new Exception(ServiceMessage.JINETE_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

}
