package com.casa_dragon.services;

import com.casa_dragon.models.Dragon;

import java.util.List;

public interface IDragonService {

    Dragon addDragon(Dragon dragon) throws Exception;

    List<Dragon> listDragons() throws Exception;

}
