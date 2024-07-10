package com.casa_dragon.services;

import com.casa_dragon.models.Dragon;
import com.casa_dragon.repositories.DragonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DragonServiceImpl implements IDragonService {

    @Autowired
    private DragonRepository dragonRepository;

    @Override
    public Dragon addDragon (Dragon dragon) throws Exception {
        try {
            return dragonRepository.save(dragon);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public List<Dragon> listDragons() throws Exception {
        try {
            return (List<Dragon>) dragonRepository.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

}
