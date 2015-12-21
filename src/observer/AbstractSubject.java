package observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject<T> implements Subject<T> {

    private Vector<Observer<T>> vector = new Vector<Observer<T>>();

    @Override
    public void register(Observer<T> observer) {
        if (observer == null) {
            throw new NullPointerException("observer == null");
        }
        if (!vector.contains(observer)) {
            vector.add(observer);
        }
    }

    @Override
    public void unregister(Observer<T> observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers(T data) {
        Enumeration<Observer<T>> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement().update(this, data);
        }
    }

}
