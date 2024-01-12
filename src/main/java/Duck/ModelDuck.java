package Duck;

import Duck.Behavior.FlyNoWay;
import Duck.Behavior.MuteQuack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        // show duck
    }
}
