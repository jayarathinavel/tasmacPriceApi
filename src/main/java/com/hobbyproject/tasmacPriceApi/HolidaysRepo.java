package com.hobbyproject.tasmacPriceApi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HolidaysRepo extends JpaRepository<HolidaysEntity, Integer> {
    @Query(value = "SELECT * FROM dry_days", nativeQuery = true)
    List<HolidaysEntity> getAllDryDays();

    @Query(value = "SELECT * FROM non_dry_days", nativeQuery = true)
    List<HolidaysEntity> getAllNonDryDays();
}
