package com.example.monopoly.models;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.*;
import java.util.List;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private int number;
    private String name;
    private Color color;
    private int balance;
    @OneToMany
    private List<Property> properties;
    private int position;

    public void upgradeProperty(Property property, int balance){
        if(balance >= property.getUpgrade()*3 && property.getNumberOfHouses() < 4){
            balance -= 3*property.getUpgrade();
            property.setPayPrice(property.getUpgradePrices().get(property.getNumberOfHouses()+1).getUpgradePrice());
            property.setNumberOfHouses(property.getNumberOfHouses() + 1);
        }else if(balance >= property.getUpgrade() * 6 &&property.getNumberOfHouses() == 4){
            balance -= 6*property.getUpgrade();
            property.setPayPrice(property.getUpgradePrices().get(property.getNumberOfHouses()+1).getUpgradePrice());
            property.setNumberOfHouses(property.getNumberOfHouses() + 1);
        }
    }

}
