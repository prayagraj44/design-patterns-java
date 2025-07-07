package org.example.behavioural.state;

public class DispensingState implements VendingMachineState{

    private VendingMachine machine;

    public DispensingState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.printf("Please wait. While dispensing still in progress");
    }

    @Override
    public void selectProduct() {
        System.out.println("Already dispensing.");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing item.");
        machine.setState(machine.getIdleState());
    }
}
