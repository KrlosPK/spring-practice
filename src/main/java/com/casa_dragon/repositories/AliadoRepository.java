package com.casa_dragon.repositories;

import com.casa_dragon.models.Aliado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliadoRepository extends JpaRepository<Aliado, Integer> {
}
