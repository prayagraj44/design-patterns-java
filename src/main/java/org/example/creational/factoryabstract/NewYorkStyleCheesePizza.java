package org.example.creational.factoryabstract;

public class NewYorkStyleCheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("NY Cheese Pizza: prepare dough");
    }

    @Override
    public void bake() {
        System.out.println("NY Cheese Pizza: bake for 20 mins");
    }

    @Override
    public void box() {
        System.out.println("NY Cheese Pizza: box in square box");
    }
}
