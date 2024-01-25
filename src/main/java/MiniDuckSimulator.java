import Strategy.Behavior.FlyRocketPowered;
import Strategy.ModelDuck;
import Strategy.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
