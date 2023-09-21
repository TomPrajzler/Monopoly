package com.example.monopoly.models;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.*;
import java.util.List;

@Entity
@Data
public class Player {
    private int money;
    private int number;
    private String name;
    private Color color;
    @OneToMany
    private List<Property> properties;
    @Id
    @GeneratedValue
    private Long id;


}
