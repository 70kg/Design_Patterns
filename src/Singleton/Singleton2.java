package Singleton;

/**
 * 饿汉式单例
 * 线程安全   类创建时就实例化一个对象
 * @author Mr_Wrong
 *
 */
public class Singleton2{
	private Singleton2(){}
	
	private static final Singleton2 Singleton = new Singleton2();
	public static Singleton2 getnInstance(){
		return Singleton;
	}
	
}