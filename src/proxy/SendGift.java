package proxy;

public interface SendGift {
	public void SendFlower();
	public void SendMoney() ;
	public void SendDurex();
}
interface StudentSendGift extends SendGift{
	public void SendHomework(Student s);
}