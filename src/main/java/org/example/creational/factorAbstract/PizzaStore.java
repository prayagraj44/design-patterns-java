package org.example.creational.factorAbstract;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    //common buisness logic applicalbe to all store/ concrete creator/factories

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
