public class HasPin implements ATMState {


    ATMMachine atmMachine;

    public HasPin(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;

    }


    @Override
    public void insertCard() {

            System.out.println("You can not enter more than one card ");


    }

    @Override
    public void ejectCard() {

        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinEntered) {

        System.out.println("Already Entered PIN");


    }

    @Override
    public void requestCash(int cashToWithDraw) {

        if(cashToWithDraw > atmMachine.cashInMachine){

        System.out.println("do not have that cash");
        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    } else {
        System.out.println(cashToWithDraw + " is provided by the machine");
        atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithDraw);
        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());

        if(atmMachine.cashInMachine <=0) {

            atmMachine.setATMState(atmMachine.getNoCashState());

        }
        
    }

    }






}