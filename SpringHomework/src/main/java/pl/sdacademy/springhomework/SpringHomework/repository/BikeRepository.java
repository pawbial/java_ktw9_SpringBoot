package pl.sdacademy.springhomework.SpringHomework.repository;

import org.springframework.stereotype.Repository;
import pl.sdacademy.springhomework.SpringHomework.model.Bike;
import pl.sdacademy.springhomework.SpringHomework.model.BikeType;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class BikeRepository {

    private Map<Integer, Bike> bikesRepository;

    public BikeRepository () {

        Bike bike1 = new Bike();
        bike1.setBikeType(BikeType.BMX);
        bike1.setGears(11);
        bike1.setName("AAA");

        Bike bike2 = new Bike();
        bike2.setBikeType(BikeType.CROSS);
        bike2.setGears(10);
        bike2.setName("BBB");

        Bike bike3 = new Bike();
        bike3.setBikeType(BikeType.CITY);
        bike3.setGears(9);
        bike3.setName("CCC");

        Bike bike4 = new Bike();
        bike4.setBikeType(BikeType.MTB);
        bike4.setGears(13);
        bike4.setName("DDD");

        Bike bike5 = new Bike();
        bike5.setBikeType(BikeType.ROAD);
        bike5.setGears(7);
        bike5.setName("EEE");

        bikesRepository = new HashMap<>();

        bikesRepository.put(1, bike1);
        bikesRepository.put(2, bike2);
        bikesRepository.put(3, bike3);
        bikesRepository.put(4, bike4);
        bikesRepository.put(5, bike5);

    }

    public Collection <Bike> getBikes () {
        return bikesRepository.values();
    }

    public Optional<Bike> getBikeByIndex (int index) {
        return Optional.of(bikesRepository.get(index));
    }

    public void addBike (Bike bike) {
        bikesRepository.put(bikesRepository.size()+1,bike);
    }

    public Bike deleteBike (int index) {
        return bikesRepository.remove(index);
    }
}
