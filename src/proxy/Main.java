package proxy;
/**
 * 代理模式
 * @author Mr_Wrong
 *
 */
public class Main {
	public static void main(String[] args) {
		Girl girl = new Girl();
		girl.setAge(20);
		girl.setName("肥儿");
		
		//一般的追求者送花
		Pursuit pursuit = new Pursuit(girl);
		pursuit.setName("wp");
		Proxy proxy = new Proxy(pursuit);
		proxy.SendFlower();
		
		//学生追求者送作业
		Student studentpursuit = new Student(girl);
		studentpursuit.setName("sb");
		Proxy proxy1 = new Proxy();
		proxy1.SendHomework(studentpursuit);
	}
}
