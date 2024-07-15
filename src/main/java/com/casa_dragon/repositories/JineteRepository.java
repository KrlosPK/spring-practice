package com.casa_dragon.repositories;

import com.casa_dragon.models.Jinete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JineteRepository extends JpaRepository<Jinete, Integer> {
}
