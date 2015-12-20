package Strategy;

/**
 * Created by Mr_Wrong on 15/12/20.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞行");
    }
}
