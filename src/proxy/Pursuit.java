package proxy;
/**
 *追求者
 * @author Mr_Wrong
 *
 */
public class Pursuit implements SendGift{
	Girl mm;
	Pursuit(Girl mm){
		this.mm = mm;
	}
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void SendFlower() {
		System.out.println(mm.getName()+","+this.getName()+"送你花,你才"+mm.getAge()+"岁");		
	}

	public void SendMoney() {
		System.out.println(mm.getName()+"送你钱,你才"+mm.getAge()+"岁");		

	}

	public void SendDurex() {
		System.out.println(mm.getName()+"送你Durex,你才"+mm.getAge()+"岁");		

	}

}
