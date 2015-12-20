package proxy;
/**
 * 学生追求者  可以送作业的说
 * @author Mr_Wrong
 *
 */
public class Student extends Pursuit implements StudentSendGift{
	Girl mm;
	Student(Girl mm) {
		super(mm);
		this.mm = mm;	
	}
	public void SendHomework(Student s) {
		System.out.println(mm.getName()+","+this.getName()+"送你作业,你才"+mm.getAge()+"岁");		
		
	}
}
