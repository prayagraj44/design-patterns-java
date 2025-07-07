package org.example.structural.decorator;

public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public Double getCost() {
        return 5.0;
    }
}
