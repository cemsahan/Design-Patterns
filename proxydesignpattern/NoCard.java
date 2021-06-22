public class NoCard implements ATMState {


    ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;

    }


    @Override
    public void insertCard() {

        System.out.println("Please Enter a PIN");
        atmMachine.setATMState(atmMachine.getYesCardState());
        


    }

    @Override
    public void ejectCard() {
        
        System.out.println("Please Enter a card First");

    }

    @Override
    public void insertPin(int pinEntered) {

        System.out.println("Please Enter a card First");

        
    }

    @Override
    public void requestCash(int cashToWithDraw) {
       
        System.out.println("Please Enter a card First");

    }







}