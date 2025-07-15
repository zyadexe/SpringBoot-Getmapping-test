package org.example.smallprojectspringboot2025;

import org.springframework.web.bind.annotation.*;



@RestController
public class Controller {


    String[] cars = {"toyota","nissan","honda"};    //car manufacturer array

    @GetMapping("/cars")
    public String[] getCars(){
        return cars;
    }

    //requesting each car by array index
    @GetMapping("/cars/{index}")
    public String getSingleCar(@PathVariable int index){
        return cars[index];
    }

    @GetMapping("/cars/count")
    public int countCars(){
        return cars.length;
    }

    String[] carTools = {"OBD","screwdrives","battery testers"};

    @GetMapping("/cars/tools")
    public String[] getAllTools(){
        return carTools;
    }

    @GetMapping("/cars/tools/{index}")
    public String getSingleTool(@PathVariable int index){
        return carTools[index];
    }

    @GetMapping("/cars/tools/count")
    public int countTools(){
        return carTools.length;
    }

    String[] sedan = {"camry","accord","corolla"};
    String[] suv = {"land cruiser","patrol","pilot"};

    @GetMapping("/cars/sedan")
    public String[] getAllSedan(){
        return sedan;
    }

    @GetMapping("/cars/sedan/{index}")
    public String getSingleSedan(@PathVariable int index){
        return sedan[index];
    }

    @GetMapping("/cars/sedan/count")
    public int sedanCount(){
        return sedan.length;
    }

    @GetMapping("/cars/suv")
    public String[] getAllSuv(){
        return suv;
    }

    @GetMapping("/cars/suv/{index}")
    public String getSingleSuv(@PathVariable int index){
        return suv[index];
    }

    @GetMapping("/cars/suv/count")
    public int suvCount(){
        return suv.length;
    }


    String[] user ={"mohamed","khalid","ali"};

    @GetMapping("/user")
    public String[] getAllUser(){
        return user;
    }

    //requesting each user by array index
    @GetMapping("/user/{index}")
    public String getUser(@PathVariable int index){
        return user[index];
    }

    @GetMapping("/user/count")
    public int countUser(){
        return user.length;
    }








}
