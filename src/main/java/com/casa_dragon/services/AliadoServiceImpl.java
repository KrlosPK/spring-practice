package com.casa_dragon.services;

import com.casa_dragon.dto.AliadoDTO;
import com.casa_dragon.helpers.ServiceMessage;
import com.casa_dragon.maps.IAliadoMap;
import com.casa_dragon.models.Aliado;
import com.casa_dragon.repositories.AliadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AliadoServiceImpl implements IAliadoService {

    @Autowired
    private AliadoRepository aliadoRepository;

    @Autowired
    private IAliadoMap iAliadoMap;

    @Override
    public AliadoDTO addAliado (Aliado aliado) throws Exception {
        try {
            return iAliadoMap.mapAliado(aliadoRepository.save(aliado));
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public List<AliadoDTO> listAliados() throws Exception {
        try {
            return iAliadoMap.mapAliadoList(aliadoRepository.findAll());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public AliadoDTO listAliadoById(Integer aliadoId) throws Exception {
        try {
            Optional<Aliado> aliadoOptional = aliadoRepository.findById(aliadoId);

            if (aliadoOptional.isPresent()) {
                return iAliadoMap.mapAliado(aliadoOptional.get());
            } else {
                throw new Exception(ServiceMessage.ALIADO_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public AliadoDTO updateAliado(Integer aliadoId, Aliado newAliado) throws Exception {
        try {
            Optional<Aliado> aliadoOptional = aliadoRepository.findById(aliadoId);

            if (aliadoOptional.isPresent()) {
                Aliado aliado = aliadoOptional.get();

                aliado.setAporteMonetario(newAliado.getAporteMonetario());
                aliado.setNombres(newAliado.getNombres());
                aliado.setUbicacion(newAliado.getUbicacion());

                return iAliadoMap.mapAliado(aliadoRepository.save(aliado));
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
