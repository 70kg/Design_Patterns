package Strategy;

/**
 * Created by Mr_Wrong on 15/12/20.
 */
public abstract class Duck {

    protected QuackBehavior mQuackBehavior;

    protected FlyBehavior mFlyBehavior;

    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQucak() {
        mQuackBehavior.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("所以鸭子都会游泳");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }
}
