package pl.sdacademy.springhomework.SpringHomework.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sdacademy.springhomework.SpringHomework.model.Bike;
import pl.sdacademy.springhomework.SpringHomework.repository.BikeRepository;

import java.util.Collection;
import java.util.Optional;


@Service
public class BikeService {


    private final static Logger LOG = LoggerFactory.getLogger(BikeService.class);

    @Autowired
    private BikeRepository bikeRepository;


    public Collection<Bike> getBikes() {

        return bikeRepository.getBikes();
    }

    public Optional<Bike> findBike(int index) {

       return bikeRepository.getBikeByIndex(index);

    }

    public void addBike(Bike bike) {
        LOG.info("adding new bike");
        bikeRepository.addBike(bike);
    }

    public void deleteBike (int index) {
        LOG.warn("Deleting bike under index: " + index);
        Bike bike = bikeRepository.deleteBike(index);

        if (bike == null) {
            LOG.info("Bike not found! Try again with another index");
        }
    }

}
