package com.example.monopoly.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UpgradePrice {
    private int upgradePrice;
    @GeneratedValue
    @Id
    private Long id;


}
