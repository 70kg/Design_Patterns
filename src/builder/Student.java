package builder;

public class Student {
	private int id;//必须填写的
	private String name;
	private String address;
	
	public static class Builder{
		private int id;//必须填写的
		private int age;
		private String name;
		private String address;
		private String sex;
		
		public Builder(int id){
			this.id = id;
		}
		
		public Builder setname(String name){
			this.name = name;
			return this;
		}
		public Builder setaddress(String address){
			this.address = address;
			return this;
		}
		
		public Student build(){
			return new Student(this);
		}
		
	}
	
	private Student(Builder builder) {
		 this.id = builder.id;
		 this.name= builder.name;
		 this.address = builder.address;
	 }
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

}
