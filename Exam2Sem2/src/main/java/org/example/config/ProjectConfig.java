package org.example.config;

import org.example.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean("BMW")
    Car car1() {
        Car obCar = new Car();
        obCar.setModel("X1");
        obCar.setMade("BMW");
        return obCar;
    }

    @Bean("Audi")
    Car car2() {
        Car obCar = new Car();
        obCar.setModel("S8");
        obCar.setMade("Audi");
        return obCar;
    }

    @Bean ("Haval")
    Car car3() {
        Car obCar = new Car();
        obCar.setModel("H7");
        obCar.setMade("Haval");
        return obCar;
    }
    @Bean
    String hello() {
        return "hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}

