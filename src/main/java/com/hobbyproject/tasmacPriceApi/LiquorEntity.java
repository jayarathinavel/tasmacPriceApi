package com.hobbyproject.tasmacPriceApi;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "tasmac_liquor_prices")
public class LiquorEntity {
    @Id
    @Column(name = "serial")
    private int serial;
    @Column(name = "name")
    private String name;
    @Column(name = "range")
    private String range;
    @Column(name = "brand")
    private String brand;
    @Column(name = "1000ml")
    private String litre;
    @Column(name = "750ml")
    private String full;
    @Column(name = "375ml")
    private String half;
    @Column(name = "180ml")
    private String quarter;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLitre() {
        return litre;
    }

    public void setLitre(String litre) {
        this.litre = litre;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getHalf() {
        return half;
    }

    public void setHalf(String half) {
        this.half = half;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }
}
