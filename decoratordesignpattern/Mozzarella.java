public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        
        System.out.println("Adding Dough");

        System.out.println("Adding Moz");

    }

    public double getCost() {

        return tempPizza.getCost()+.50;
    }


    public String getDescription() {

        return tempPizza.getDescription()+", Mozzarella";
    }



}