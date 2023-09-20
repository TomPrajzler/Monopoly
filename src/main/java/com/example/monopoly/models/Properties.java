package com.example.monopoly.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Properties {
    @OneToOne
    private Player owner;
    private int price;
    private List<Integer> upgradePrices;
    private int numberOfHouses;
    @Id
    @GeneratedValue
    private Long id;

}
