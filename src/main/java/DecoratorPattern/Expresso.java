package DecoratorPattern;

public class Expresso extends Beverage {
    public Expresso() {
        description = "Expresso";
    }

    public double cost() {
        return 2.0;
    }
}
