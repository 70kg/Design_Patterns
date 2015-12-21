package observer;

/**
 * 实现类
 *
 * @author Mr_Wrong
 */
public class Observer1 implements Observer<Weather> {

    @Override
    public void update(Subject<Weather> subject, Weather data) {
        System.out.println(data.getDescription());
    }
}
