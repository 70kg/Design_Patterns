package observer;

/**
 * 观察者测试类
 *
 * @author Mr_Wrong
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        sub.register(observer1);
        sub.register(observer2);

        Weather weather = new Weather("hahah");
        sub.notifyObservers(weather);

        sub.unregister(observer1);
        Weather weather1 = new Weather("lalal");
        sub.notifyObservers(weather1);

    }
}
