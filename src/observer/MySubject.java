package observer;

public class MySubject extends AbstractSubject{

	public void operation() {
		System.out.println("自己更新");
		notifyObservers();
	}

}
