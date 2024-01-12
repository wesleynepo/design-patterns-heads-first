package Duck;

import Duck.Behavior.FlyWithWings;
import Duck.Behavior.Squeak;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        // show the redhead duck
    }
}
