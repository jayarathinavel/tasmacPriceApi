package com.hobbyproject.tasmacPriceApi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepo extends JpaRepository<BeerEntity, Integer> {
}
