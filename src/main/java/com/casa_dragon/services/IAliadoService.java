package com.casa_dragon.services;


import com.casa_dragon.models.Aliado;

import java.util.List;

public interface IAliadoService {

    Aliado addAliado(Aliado aliado) throws Exception;

    List<Aliado> listAliados() throws Exception;

}
