package org.example.structural.decorator;

public class TomatoDecorator extends PizzaDecorator {

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato" ;
    }

    @Override
    public Double getCost() {
        return super.getCost() + 1.0;
    }



}
