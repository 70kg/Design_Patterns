package factory_method;

public class Customer {
	public static void main(String[] args) {
		FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		factoryBMW320.createBMW();
		
		FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		factoryBMW523.createBMW();
	}

}
