public class PizzaMaker {


    public static void main(String[] args) {
        
        Pizza basicPizza=new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("incgredients: "+basicPizza.getDescription());
        System.out.println("Price: "+basicPizza.getCost());

    }



}