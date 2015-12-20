package Strategy;

/**
 * Created by Mr_Wrong on 15/12/20.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("使用翅膀飞行");
    }
}
