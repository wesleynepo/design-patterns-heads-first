import Duck.Behavior.FlyRocketPowered;
import Duck.ModelDuck;
import Duck.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
