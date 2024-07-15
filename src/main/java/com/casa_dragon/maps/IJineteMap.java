package com.casa_dragon.maps;

import com.casa_dragon.dto.JineteDTO;
import com.casa_dragon.models.Jinete;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IJineteMap {

    @Mappings({
            @Mapping(source = "nombres", target = "nombres"),
            @Mapping(source = "edad", target = "edad")
    })
    public JineteDTO mapJinete(Jinete jinete);

    public List<JineteDTO> mapeJineteList(List<Jinete> jineteList);

}
