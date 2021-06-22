public class NoCash implements ATMState {


    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;


    }


    @Override
    public void insertCard() {

        System.out.println("We do not have many");

    }

    @Override
    public void ejectCard() {
        
        System.out.println("We do not have money. you did not enter a card");

    }

    @Override
    public void insertPin(int pinEntered) {

        System.out.println("We do not have money");

    }

    @Override
    public void requestCash(int cashToWithDraw) {
        
        System.out.println("We do not have money");
        

    }






}