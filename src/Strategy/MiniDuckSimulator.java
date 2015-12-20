package Strategy;

/**
 * Created by Mr_Wrong on 15/12/20.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQucak();
        mallard.display();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}
