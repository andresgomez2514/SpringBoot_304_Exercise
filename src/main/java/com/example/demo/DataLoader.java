package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Car car = new Car("Toyota", "Prius", 2015);
        repository.save(car);

        car = new Car("Honda", "CRV", 2015);
        repository.save(car);

        car = new Car("Toyota", "Takoma", 2012);
        repository.save(car);
    }
}
