package org.example.creational.factoryabstract;

public class ChicagoStyleCheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Chicago Style Cheese Pizza: prepare dough with less water");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Style Cheese Pizza: bake for 10 mins");
    }

    @Override
    public void box() {
        System.out.println("Chicago Style Cheese Pizza: box in circular box");
    }
}
