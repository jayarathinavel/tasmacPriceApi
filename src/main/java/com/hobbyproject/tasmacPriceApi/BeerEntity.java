package com.hobbyproject.tasmacPriceApi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasmac_beer_prices")
public class BeerEntity {
    @Id
    @Column(name = "serial")
    private int serial;
    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
    @Column(name = "650ml")
    private String largeBottle;
    @Column(name = "500ml")
    private String can;
    @Column(name = "325ml")
    private String smallBottle;

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLargeBottle() {
        return largeBottle;
    }

    public void setLargeBottle(String largeBottle) {
        this.largeBottle = largeBottle;
    }

    public String getCan() {
        return can;
    }

    public void setCan(String can) {
        this.can = can;
    }

    public String getSmallBottle() {
        return smallBottle;
    }

    public void setSmallBottle(String smallBottle) {
        this.smallBottle = smallBottle;
    }
}
