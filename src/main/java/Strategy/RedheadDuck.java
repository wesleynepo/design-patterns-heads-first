package Strategy;

import Strategy.Behavior.FlyWithWings;
import Strategy.Behavior.Squeak;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        // show the redhead duck
    }
}
