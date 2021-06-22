public class VeggieHoagie extends Hoagie {



    
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    boolean customerWantsMeat(){return false;}
    boolean customerWantsCheese(){return false;}
   





    @Override
    void addCheese() { }

    @Override
    void addCondiments() {

        System.out.println("Adding the Condiments: ");

        for (String condiment : condimentsUsed) {
            System.out.print(condiment+" ");
        }

    }

    @Override
    void addMeat() {}

    @Override
    void addVegetables() {

        System.out.println("Adding the Veggies: ");

        for (String veggies : veggiesUsed) {
            System.out.print(veggies+" ");
        }

    }


    




}