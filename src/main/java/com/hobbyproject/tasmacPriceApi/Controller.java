package com.hobbyproject.tasmacPriceApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private LiquorRepo liquorRepo;

    @Autowired
    private BeerRepo beerRepo;

    @Autowired
    private HolidaysRepo holidaysRepo;

    @Autowired
    private AlternatePriceListRepo alternatePriceListRepo;

    @GetMapping("getAllLiquor")
    public List<LiquorEntity> getAllLiquor(){
        return liquorRepo.findAll();
    }

    @GetMapping("getAllBeer")
    public List<BeerEntity> getAllBeer() {
        return beerRepo.findAll();
    }

    @GetMapping("getAllOfALiquorType")
    public List<LiquorEntity> getAllBrandy(String liquorType){
        return liquorRepo.getSpecificLiquor(liquorType);
    }

    @GetMapping("getAllDistilleries")
    public List<String> getAllDistilleries(){
        return liquorRepo.getDistilleries();
    }

    @GetMapping("getAllFromADistillery")
    public  List<LiquorEntity> getAllFromADistillery(String distillery){
        return liquorRepo.getAllFromADistillery(distillery);
    }

    @GetMapping("getDryDays")
    public List<HolidaysEntity> getDryDays() {
        return holidaysRepo.getAllDryDays();
    }

    @GetMapping("getNonDryDays")
    public List<HolidaysEntity> getNonDryDays() {
        return holidaysRepo.getAllNonDryDays();
    }

    @GetMapping("getAlternatePriceList")
    public  List<AlternatePriceListEntity> getAlternatePriceList(){
        return alternatePriceListRepo.findAll();
    }

    @GetMapping("/")
    public  String index(){
        return "This is an API, please visit https://tasmac-price-app.herokuapp.com/ for the Application.";
    }
}
