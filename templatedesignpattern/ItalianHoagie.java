public class ItalianHoagie extends Hoagie {



    String[] meatUsed = {"Salami", "Pepperoni","Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};




    @Override
    void addCheese() {

        System.out.println("Adding the Cheese: ");

        for (String cheese : cheeseUsed) {
            System.out.print(cheese+" ");
        }

    }

    @Override
    void addCondiments() {

        System.out.println("Adding the Condiments: ");

        for (String condiment : condimentsUsed) {
            System.out.print(condiment+" ");
        }

    }

    @Override
    void addMeat() {

        System.out.println("Adding the Meat: ");

        for (String meat : meatUsed) {
            System.out.print(meat+" ");
        }

    }

    @Override
    void addVegetables() {

        System.out.println("Adding the Veggies: ");

        for (String veggies : veggiesUsed) {
            System.out.print(veggies+" ");
        }

    }


    




}