package Strategy;

/**
 * Created by Mr_Wrong on 15/12/20.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我会嘎嘎嘎叫");
    }
}
