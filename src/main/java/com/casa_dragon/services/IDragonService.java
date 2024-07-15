package com.casa_dragon.services;

import com.casa_dragon.dto.DragonDTO;
import com.casa_dragon.models.Dragon;

import java.util.List;

public interface IDragonService {

    DragonDTO addDragon(Dragon dragon) throws Exception;

    List<DragonDTO> listDragons() throws Exception;

    DragonDTO listDragonById(Integer dragonId) throws Exception;

    DragonDTO updateDragon(Integer dragonId, Dragon newDragon) throws Exception;

    Boolean deleteDragon(Integer dragonId) throws Exception;

}
