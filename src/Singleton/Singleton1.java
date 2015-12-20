package Singleton;

/**
 * 懒汉式单例
 * 线程不安全  使用时才创建对象  当需要传递参数进去构造函数  使用
 * @author Mr_Wrong
 *
 */
public class Singleton1{
	private Singleton1(){};
	private static Singleton1 Singleton= null;
	public  static Singleton1 getInstance(){

		if(Singleton == null){
			Singleton = new Singleton1();
		}
		return Singleton;
	}
	
	String mName;
	public void setname(String name){
		this.mName  = name;
	}
	public  void  printname(){
		System.out.println(mName);
	}
}