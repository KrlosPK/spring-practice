package com.casa_dragon.services;

import com.casa_dragon.models.Jinete;

import java.util.List;

public interface IJineteService {

    Jinete addJinete(Jinete jinete) throws Exception;

    List<Jinete> listJinetes() throws Exception;

    Jinete listJineteById(Integer jineteId) throws Exception;

    Jinete updateJinete(Integer jineteId, Jinete newJinete) throws Exception;

    Boolean deleteJinete(Integer jineteId) throws Exception;

}
