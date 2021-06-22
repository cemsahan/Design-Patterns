public class ATMProxy implements GetATMData{





    @Override
    public ATMState getATMData() {
        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getATMData();
    }

    @Override
    public int getCashINMachine() {
       
        ATMMachine realATMMachine = new ATMMachine();
        
        return realATMMachine.cashInMachine;
    }



}