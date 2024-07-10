package com.casa_dragon.repositories;

import com.casa_dragon.models.Dragon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DragonRepository extends CrudRepository<Dragon, Integer> {
}
