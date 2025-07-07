package org.example.behavioural.state;

public class VendingMachine {

    private VendingMachineState idleState;
    private VendingMachineState hasCoinState;
    private VendingMachineState dispensingState;

    private VendingMachineState currentState;

    public VendingMachine(){
        idleState = new IdleState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);
        currentState = idleState;
    }

    public void setState(VendingMachineState state){
        this.currentState = state;
    }

    public void insertCoin(){
        currentState.insertCoin();
    }

    public void selectProduct(){
        currentState.selectProduct();
    }

    public void dispenseProduct(){
        currentState.selectProduct();
    }


    public VendingMachineState getHasCoinState() {
        return hasCoinState;
    }

    public void setHasCoinState(VendingMachineState hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    public VendingMachineState getIdleState() {
        return idleState;
    }

    public void setIdleState(VendingMachineState idleState) {
        this.idleState = idleState;
    }

    public VendingMachineState getDispensingState() {
        return dispensingState;
    }

    public void setDispensingState(VendingMachineState dispensingState) {
        this.dispensingState = dispensingState;
    }
}
