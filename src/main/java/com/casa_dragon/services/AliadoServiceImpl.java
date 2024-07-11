package com.casa_dragon.services;

import com.casa_dragon.helpers.ServiceMessage;
import com.casa_dragon.models.Aliado;
import com.casa_dragon.models.Dragon;
import com.casa_dragon.repositories.AliadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Aliado listAliadoById(Integer aliadoId) throws Exception {
        try {
            Optional<Aliado> aliadoOptional = aliadoRepository.findById(aliadoId);

            if (aliadoOptional.isPresent()) {
                return aliadoOptional.get();
            } else {
                throw new Exception(ServiceMessage.ALIADO_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Aliado updateAliado(Integer aliadoId, Aliado newAliado) throws Exception {
        try {
            Optional<Aliado> aliadoOptional = aliadoRepository.findById(aliadoId);

            if (aliadoOptional.isPresent()) {
                Aliado aliado = aliadoOptional.get();

                aliado.setAporteMonetario(newAliado.getAporteMonetario());
                aliado.setNombres(newAliado.getNombres());
                aliado.setUbicacion(newAliado.getUbicacion());

                return aliadoRepository.save(aliado);
            } else {
                throw new Exception(ServiceMessage.ALIADO_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Boolean deleteAliado(Integer aliadoId) throws Exception {
        try {
            Optional<Aliado> aliadoOptional = aliadoRepository.findById(aliadoId);

            if (aliadoOptional.isPresent()) {
                aliadoRepository.deleteById(aliadoId);
                return true;
            } else {
                throw new Exception(ServiceMessage.ALIADO_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

}
