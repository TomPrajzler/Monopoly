package com.example.monopoly.controllers;

import com.example.monopoly.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    private GameService gameService;
    public GameController(GameService gameService){
        this.gameService = gameService;
    }
    @GetMapping("/game/roll")
    public ResponseEntity<?> rollTheDice(){
        return  ResponseEntity.ok(gameService.rollTheDice());
    }
}
