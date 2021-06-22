public class Tobacco implements Visitable {


    private double price;

    public Tobacco(double item) {

        price = item;

    }

    public double getPrice() { return price; }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
	}

}