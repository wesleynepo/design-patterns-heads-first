package DecoratorPattern;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House blend";
    }
    public double cost() {
        return 0.89;
    }
}
