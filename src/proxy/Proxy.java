package proxy;
/**
 * 代理类 可以实习多个接口  实现多个代理功能
 * @author Mr_Wrong
 *
 */
public class Proxy implements SendGift,StudentSendGift{
	Pursuit p ;

	Proxy(Pursuit p){
		this.p = p;
	}
	Proxy(){

	}
	public void SendFlower() {
		p.SendFlower();		
	}

	public void SendMoney() {
		p.SendMoney();		
	}

	public void SendDurex() {
		p.SendDurex();		
	}

	public void SendHomework(Student s) {
		s.SendHomework(s);		
	}

}
