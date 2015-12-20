package observer;
/**
 * 观察者测试类
 * @author Mr_Wrong
 *
 */
public class ObserverTest {
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.operation();
	}
}
