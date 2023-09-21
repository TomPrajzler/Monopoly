package com.example.monopoly.repositories;

import com.example.monopoly.models.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player,Long> {
}
