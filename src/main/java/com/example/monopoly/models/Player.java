package com.example.monopoly.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.awt.*;
import java.util.*;
import java.util.List;

@Entity
@Data
public class Player {
    private int number;
    private String name;
    private Color color;
    @ManyToOne
    private Properties properties;
    @Id
    @GeneratedValue
    private Long id;


}
