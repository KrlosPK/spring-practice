package com.casa_dragon.services;


import com.casa_dragon.models.Aliado;

import java.util.List;

public interface IAliadoService {

    Aliado addAliado(Aliado aliado) throws Exception;

    List<Aliado> listAliados() throws Exception;

    Aliado listAliadoById(Integer aliadoId) throws Exception;

    Aliado updateAliado(Integer aliadoId, Aliado newAliado) throws Exception;

    Boolean deleteAliado(Integer aliadoId) throws Exception;

}
