package com.example.monopoly.repositories;

import com.example.monopoly.models.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository <Game, Long> {
}
