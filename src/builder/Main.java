package builder;

public class Main {
	public static void main(String[] args) {
		
		Student s = new Student.Builder(1).setaddress("山东省").setname("70kg").build();
		System.out.println("address:"+s.getAddress()+"   name:"+s.getName()+"   id:"+s.getId());
		
	}

}
