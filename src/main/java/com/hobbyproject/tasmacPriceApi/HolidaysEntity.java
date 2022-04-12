package com.hobbyproject.tasmacPriceApi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HolidaysEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "holiday_name")
    private String holidayName;
    @Column(name = "holiday_date")
    private String holidayDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public String getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(String holidayDate) {
        this.holidayDate = holidayDate;
    }
}
