package org.example.creational.factorAbstract;

public class NewYorkPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if(type ==  "CHEESE"){
            return new NewYorkStyleCheesePizza();
        }
        return null;
    }
}
