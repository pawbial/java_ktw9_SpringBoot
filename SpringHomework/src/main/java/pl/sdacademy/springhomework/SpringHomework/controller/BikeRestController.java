package pl.sdacademy.springhomework.SpringHomework.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sdacademy.springhomework.SpringHomework.model.Bike;
import pl.sdacademy.springhomework.SpringHomework.service.BikeService;

import java.util.Collection;
import java.util.Optional;

@Controller
@RequestMapping("/bikes")
public class BikeRestController {

    @Autowired
    private BikeService bikeService;


    @GetMapping ("/{id}")
    public ResponseEntity<Optional<Bike>> getBike (@PathVariable String id) {

        int index = Integer.parseInt(id);

        return ResponseEntity.ok(bikeService.findBike(index));
    }

    @GetMapping
    public @ResponseBody Collection<Bike> getBikes () {
        return bikeService.getBikes();
    }

    @PostMapping
    @ResponseStatus (HttpStatus.CREATED)
    public void addBike (@RequestBody Bike bike) {
        bikeService.addBike(bike);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus (HttpStatus.OK)
    public void deleteBike (@PathVariable String index) {
        int id = Integer.parseInt(index);
        bikeService.deleteBike(id);
    }
}
