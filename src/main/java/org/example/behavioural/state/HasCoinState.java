package org.example.behavioural.state;

public class HasCoinState implements VendingMachineState{

    private VendingMachine machine;

    public HasCoinState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.printf("Coin already inserted");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected.");
        machine.setState(machine.getDispensingState());
    }

    @Override
    public void dispense() {
        System.out.println("Select product first.");
    }
}
