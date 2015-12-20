package Singleton;

/**
 * 单例模式
 * @author Mr_Wrong
 *
 */
public class Singleton {
	public static void main(String[] args) {
		
		Singleton1 singleton1 = Singleton1.getInstance();
		singleton1.setname("name1");
		Singleton1 singleton11 = singleton1.getInstance();
		singleton11.setname("name2");
		
		singleton1.printname();
		singleton11.printname();
		
		
		
	}

}

