package com.example.monopoly.services;

import com.example.monopoly.models.DiceRoll;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    public DiceRoll rollTheDice(){
        DiceRoll newDiceroll = new DiceRoll(0, 0);
        return newDiceroll.rollTheDice();
    }
}
