package com.example.monopoly.repositories;

import com.example.monopoly.models.UpgradePrice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpgradePriceRepository extends CrudRepository<UpgradePrice, Long> {
}
