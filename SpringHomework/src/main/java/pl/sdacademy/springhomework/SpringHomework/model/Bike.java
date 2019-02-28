package pl.sdacademy.springhomework.SpringHomework.model;


import lombok.Data;

@Data
public class Bike {

    private int id;
    private String name;
    private int gears;
    private BikeType bikeType;

}
