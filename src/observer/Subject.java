package observer;

public interface Subject<T> {
	/*增加观察者*/  
	public void register(Observer<T> observer);

	/*删除观察者*/  
	public void unregister(Observer<T> observer);

	/*通知所有的观察者*/  
	public void notifyObservers(T data);

}
