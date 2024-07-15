package com.casa_dragon.maps;

import com.casa_dragon.dto.AliadoDTO;
import com.casa_dragon.models.Aliado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IAliadoMap {

    @Mappings({
            @Mapping(source = "nombres", target = "nombres"),
            @Mapping(source = "ubicacion", target = "ubicacion")
    })
    public AliadoDTO mapAliado(Aliado aliado);

    public List<AliadoDTO> mapAliadoList(List<Aliado> aliadoList);

}
