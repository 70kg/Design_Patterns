package simple_factory;

public class Customer {
	public static void main(String[] args) {
		Factory factory = new Factory();
		BMW bmw320 =factory.CreateBMW(320);
		BMW bmw532 = factory.CreateBMW(523);
		System.out.println("wancgeng");
	}

}
