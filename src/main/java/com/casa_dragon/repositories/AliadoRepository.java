package com.casa_dragon.repositories;

import com.casa_dragon.models.Aliado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliadoRepository extends CrudRepository<Aliado, Integer> {
}
