package org.example.structural.decorator;

public class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " , Mushroom" ;
    }

    @Override
    public Double getCost() {
        return super.getCost() + 2.0;
    }
}
