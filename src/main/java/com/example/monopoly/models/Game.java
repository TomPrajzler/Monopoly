package com.example.monopoly.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Game {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Player player;


}
