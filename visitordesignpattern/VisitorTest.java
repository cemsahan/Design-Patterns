public class VisitorTest {


    public static void main(String[] args) {

        TaxVisitor taxcalc = new TaxVisitor();
        TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(3.47);
        Tobacco cigars = new Tobacco(3.47);

        System.out.println(milk.accept(taxcalc)+ "\n");
        System.out.println(vodka.accept(taxcalc)+ "\n");
        System.out.println(cigars.accept(taxcalc)+ "\n");

        System.out.println("Tax Holiday Prices \n");

        System.out.println(milk.accept(taxHolidayCalc)+ "\n");
        System.out.println(vodka.accept(taxHolidayCalc)+ "\n");
        System.out.println(cigars.accept(taxHolidayCalc)+ "\n");





    }




}