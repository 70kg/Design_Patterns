package observer;

/**
 * 实现类2
 *
 * @author Mr_Wrong
 */
public class Observer2 implements Observer<Weather> {

    @Override
    public void update(Subject<Weather> subject, Weather data) {
        System.out.println(data.getDescription());
    }
}
