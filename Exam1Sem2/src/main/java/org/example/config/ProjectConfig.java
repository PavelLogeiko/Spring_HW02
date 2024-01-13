package org.example.config;

import org.example.domain.Car;
import org.example.domain.Engin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example.domain")
public class ProjectConfig {

//    @Bean
//    Engin engin() {
//        Engin engin = new Engin();
//        return engin;
//    }
//
//    @Bean
//    @Primary
//    Car car() {
//        Car obCar = new Car();
//        obCar.setCarEngine(engin());
//        obCar.setModel("S8");
//        obCar.setMade("Audi");
//        return obCar;
//    }
//    @Bean
//    Car car2() {
//        Car obCar = new Car();
//        obCar.setCarEngine(engin());
//        obCar.setModel("S8");
//        obCar.setMade("Audi");
//        return obCar;
//    }
}
