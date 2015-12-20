package Strategy;

/**
 * Created by Mr_Wrong on 15/12/20.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        mQuackBehavior = new Quack();
        mFlyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是真的绿头鸭");
    }
}
