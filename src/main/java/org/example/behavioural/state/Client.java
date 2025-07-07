package org.example.behavioural.state;

public class Client {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.dispenseProduct();

        System.out.println("--------");

        vendingMachine.insertCoin();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();

        System.out.println("------");

        vendingMachine.selectProduct();
        vendingMachine.insertCoin();
        vendingMachine.insertCoin();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();

    }

}
