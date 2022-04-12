package com.hobbyproject.tasmacPriceApi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlternatePriceListRepo extends JpaRepository<AlternatePriceListEntity, Integer> {
}
