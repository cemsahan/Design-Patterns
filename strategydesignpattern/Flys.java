
public interface Flys {

    String fly();

}

class ItFlys implements Flys {



    public String fly() {

        return "Flying Hight";
    }

}
class CantFly implements Flys {

    public String fly() {

        return "I can't fly";
    }

    
}