package com.hobbyproject.tasmacPriceApi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LiquorRepo extends JpaRepository<LiquorEntity, Integer> {
    @Query(value = "SELECT * FROM tasmac_liquor_prices WHERE name LIKE %?1", nativeQuery = true)
    List<LiquorEntity> getSpecificLiquor(String liquorType);

    @Query(value = "SELECT DISTINCT brand FROM tasmac_liquor_prices", nativeQuery = true)
    List<String> getDistilleries();

    @Query(value = "SELECT * FROM tasmac_liquor_prices WHERE brand = ?1", nativeQuery = true)
    List<LiquorEntity> getAllFromADistillery(String distillery);
}
