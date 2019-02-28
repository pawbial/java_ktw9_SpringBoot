package pl.sdacademy.springhomework.SpringHomework.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.sdacademy.springhomework.SpringHomework.model.Bike;
import pl.sdacademy.springhomework.SpringHomework.service.BikeService;

import java.util.Optional;

@Controller
public class BikeRestController {

    @Autowired
    private BikeService bikeService;


    @GetMapping ("/{id}")
    public ResponseEntity<Optional<Bike>> getBike (@PathVariable String id) {

        int index = Integer.parseInt(id);

        return ResponseEntity.ok(bikeService.findBike(index));
    }
}
