package com.casa_dragon.services;

import com.casa_dragon.dto.DragonDTO;
import com.casa_dragon.helpers.ServiceMessage;
import com.casa_dragon.maps.IDragonMap;
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

    @Autowired
    private IDragonMap iDragonMap;

    @Override
    public DragonDTO addDragon (Dragon dragon) throws Exception {
        try {
            return iDragonMap.mapDragon(dragonRepository.save(dragon));
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public List<DragonDTO> listDragons() throws Exception {
        try {
            return iDragonMap.mapDragonList(dragonRepository.findAll());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public DragonDTO listDragonById(Integer dragonId) throws Exception {
        try {
            Optional<Dragon> dragonOptional = dragonRepository.findById(dragonId);

            if (dragonOptional.isPresent()) {
                return iDragonMap.mapDragon(dragonOptional.get());
            } else {
                throw new Exception(ServiceMessage.DRAGON_NOT_FOUND.getMessage());
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public DragonDTO updateDragon(Integer dragonId, Dragon newDragon) throws Exception {
        try {
            Optional<Dragon> dragonOptional = dragonRepository.findById(dragonId);

            if (dragonOptional.isPresent()) {
                Dragon dragon = dragonOptional.get();

                dragon.setAltura(newDragon.getAltura());
                dragon.setEdad(newDragon.getEdad());
                dragon.setNombre(newDragon.getNombre());
                dragon.setNumeroVictorias(newDragon.getNumeroVictorias());

                return iDragonMap.mapDragon(dragonRepository.save(dragon));
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
