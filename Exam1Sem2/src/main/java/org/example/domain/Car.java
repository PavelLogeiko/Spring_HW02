package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model = "BMW";
    private String made = "X1";

    @Autowired
    private Engin carEngine;

    public Car() {
        System.out.println("Автомобиль создан!");

    }
    public Engin getCarEngine(Engin engin) {
        return carEngine;
    }

    public void setCarEngine(Engin carEngine) {
        this.carEngine = carEngine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", made='" + made + '\'' +
                ", carEngine=" + carEngine +
                '}';
    }
}
