package org.example.creational.factoryabstract;

public class Client {

    public static void main(String[] args) {

        PizzaStore ny = new NewYorkPizzaStore();
        PizzaStore ch = new ChicagoPizzaStore();

        ny.orderPizza("CHEESE");
        System.out.println();
        ch.orderPizza("CHEESE");

    }

}
