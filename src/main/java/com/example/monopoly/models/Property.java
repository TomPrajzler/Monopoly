package com.example.monopoly.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Property {
    @Id
    @GeneratedValue
    private Long id;
    private int price;
    @OneToMany
    private List<UpgradePrice> upgradePrices;
    private int numberOfHouses;
    private int upgrade;
    private boolean upgradeAble;
    private int payPrice;

}
