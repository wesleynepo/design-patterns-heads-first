package Strategy;

import Strategy.Behavior.FlyNoWay;
import Strategy.Behavior.MuteQuack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        // show duck
    }
}
