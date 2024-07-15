package com.casa_dragon.services;


import com.casa_dragon.dto.AliadoDTO;
import com.casa_dragon.models.Aliado;

import java.util.List;

public interface IAliadoService {

    AliadoDTO addAliado(Aliado aliado) throws Exception;

    List<AliadoDTO> listAliados() throws Exception;

    AliadoDTO listAliadoById(Integer aliadoId) throws Exception;

    AliadoDTO updateAliado(Integer aliadoId, Aliado newAliado) throws Exception;

    Boolean deleteAliado(Integer aliadoId) throws Exception;

}
