package com.example.monopoly.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiceRoll {
    private int first;
    private int second;

    public DiceRoll rollTheDice() {
        int first = (int) (Math.random() * 6 + 1);
        int second = (int) (Math.random() * 6 + 1);
        return new DiceRoll(first, second);
    }
}

