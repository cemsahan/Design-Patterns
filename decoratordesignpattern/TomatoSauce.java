public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        
        System.out.println("Adding Sauce");


    }

    public double getCost() {

        return tempPizza.getCost()+.35;
    }


    public String getDescription() {

        return tempPizza.getDescription()+", Tomato Sauce";
    }



}