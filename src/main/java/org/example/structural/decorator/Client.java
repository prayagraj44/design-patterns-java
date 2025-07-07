package org.example.structural.decorator;

public class Client {

    public static void main(String[] args) {

        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() +" : "+pizza.getCost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() +" : "+pizza.getCost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() +" : "+pizza.getCost());

        pizza = new TomatoDecorator(pizza);
        System.out.println(pizza.getDescription() +" : "+pizza.getCost());

        Pizza basePizza = new PlainPizza();
        basePizza = new CheeseDecorator(basePizza);
        basePizza = new TomatoDecorator(basePizza);
        System.out.println(basePizza.getDescription() +" : "+basePizza.getCost());











    }
}
