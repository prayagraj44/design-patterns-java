package org.example.creational.factorAbstract;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type ==  "CHEESE"){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
