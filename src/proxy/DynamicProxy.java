package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	public static void consumer(SendGift sendGift){
		sendGift.SendFlower();
		sendGift.SendDurex();
	}
	public static void main(String[] args) {
		Pursuit pursuit = new Pursuit(new Girl());
		SendGift proxy =(SendGift)Proxy.newProxyInstance(SendGift.class.getClassLoader(),
				new Class[]{SendGift.class}, new DynamicProxyHandler(pursuit));
		//consumer(proxy);
		
		DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(pursuit);
		SendGift sendGift = (SendGift) dynamicProxyHandler.bindRelation();
		consumer(sendGift);
		
	}

}
class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied){
		this.proxied = proxied;
	}
	
	 public Object bindRelation(){           
	        return Proxy.newProxyInstance(proxied.getClass().getClassLoader(), proxied.getClass().getInterfaces(),this);           
	    }    
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(proxied, args);
	}
}