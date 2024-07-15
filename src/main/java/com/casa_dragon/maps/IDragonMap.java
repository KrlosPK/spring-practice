package com.casa_dragon.maps;

import com.casa_dragon.dto.DragonDTO;
import com.casa_dragon.models.Dragon;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDragonMap {

    @Mappings({
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "edad", target = "edad")
    })
    public DragonDTO mapDragon(Dragon dragon);

    public List<DragonDTO> mapDragonList(List<Dragon> dragonList);

}
