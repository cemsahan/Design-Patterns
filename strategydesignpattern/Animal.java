

public class Animal{


private String name;
private int weight;
private String sound;
private double height;
private String favFood;
private double speed;

public Flys flyingType;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public void setWeight(int newWeight){

    if(newWeight>0){
        weight=newWeight;
    }else{
        System.out.println("Weight must be bigger than 0");
    }

}
 public int getWeight(){return weight;}

    public String getSound() {
        return sound;
    
    }

    

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String tryToFly(){

        return flyingType.fly();

    }
    public void setFlyingAbility(Flys newFlysType){

        flyingType=newFlysType;

    }


}


