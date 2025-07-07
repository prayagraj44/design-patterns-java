package org.example.behavioural.state;

public class IdleState implements VendingMachineState{

    private VendingMachine machine;

    public IdleState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.printf("Coin inserted");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Insert coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("Insert coin first and then select product");
    }
}
