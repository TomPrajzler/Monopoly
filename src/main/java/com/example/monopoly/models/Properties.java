package com.example.monopoly.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Properties {
    private int price;
    @OneToMany
    private List<UpgradePrices> upgradePrices;
    private int numberOfHouses;
    @Id
    @GeneratedValue
    private Long id;

}
