package org.example.structural.decorator;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " , Cheese" ;
    }

    @Override
    public Double getCost() {
        return super.getCost() + 3.0;
    }
}
