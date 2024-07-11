package com.casa_dragon.services;

import com.casa_dragon.helpers.ServiceMessage;
import com.casa_dragon.models.Dragon;
import com.casa_dragon.repositories.DragonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Dragon listDragonById(Integer dragonId) throws Exception {
        try {
            Optional<Dragon> dragonOptional = dragonRepository.findById(dragonId);

            if (dragonOptional.isPresent()) {
                return dragonOptional.get();
            } else {
                throw new Exception(ServiceMessage.DRAGON_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Dragon updateDragon(Integer dragonId, Dragon newDragon) throws Exception {
        try {
            Optional<Dragon> dragonOptional = dragonRepository.findById(dragonId);

            if (dragonOptional.isPresent()) {
                Dragon dragon = dragonOptional.get();

                dragon.setAltura(newDragon.getAltura());
                dragon.setEdad(newDragon.getEdad());
                dragon.setNombre(newDragon.getNombre());
                dragon.setNumeroVictorias(newDragon.getNumeroVictorias());

                return dragonRepository.save(dragon);
            } else {
                throw new Exception(ServiceMessage.DRAGON_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Boolean deleteDragon(Integer dragonId) throws Exception {
        try {
            Optional<Dragon> dragonOptional = dragonRepository.findById(dragonId);

            if (dragonOptional.isPresent()) {
                dragonRepository.deleteById(dragonId);
                return true;
            } else {
                throw new Exception(ServiceMessage.DRAGON_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

}
