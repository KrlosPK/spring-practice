package com.casa_dragon.services;

import com.casa_dragon.models.Dragon;
import com.casa_dragon.models.Jinete;

import java.util.List;

public interface IJineteService {

    Jinete addJinete(Jinete jinete) throws Exception;

    List<Jinete> listJinetes() throws Exception;

}
