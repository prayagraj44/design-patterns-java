package org.example.creational.factoryabstract;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type ==  "CHEESE"){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
