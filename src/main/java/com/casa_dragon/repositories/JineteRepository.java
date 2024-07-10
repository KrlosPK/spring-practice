package com.casa_dragon.repositories;

import com.casa_dragon.models.Jinete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JineteRepository extends CrudRepository<Jinete, Integer> {
}
