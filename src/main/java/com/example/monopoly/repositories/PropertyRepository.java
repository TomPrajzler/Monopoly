package com.example.monopoly.repositories;

import com.example.monopoly.models.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Long> {
}
