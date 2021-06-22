abstract class ToppingDecorator implements Pizza {


    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza){

        tempPizza=newPizza;

    }

    public double getCost() {

        return tempPizza.getCost();
    }


    public String getDescription() {

        return tempPizza.getDescription();
    }


}