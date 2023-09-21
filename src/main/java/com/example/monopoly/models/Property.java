package com.example.monopoly.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Property {
    private int price;
    @OneToMany
    private List<UpgradePrice> upgradePrices;
    private int numberOfHouses;
    @Id
    @GeneratedValue
    private Long id;

}
