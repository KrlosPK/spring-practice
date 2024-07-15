package com.casa_dragon.repositories;

import com.casa_dragon.models.Dragon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DragonRepository extends JpaRepository<Dragon, Integer> {
}
