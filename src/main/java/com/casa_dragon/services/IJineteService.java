package com.casa_dragon.services;

import com.casa_dragon.dto.JineteDTO;
import com.casa_dragon.models.Jinete;

import java.util.List;

public interface IJineteService {

    JineteDTO addJinete(Jinete jinete) throws Exception;

    List<JineteDTO> listJinetes() throws Exception;

    JineteDTO listJineteById(Integer jineteId) throws Exception;

    JineteDTO updateJinete(Integer jineteId, Jinete newJinete) throws Exception;

    Boolean deleteJinete(Integer jineteId) throws Exception;

}
