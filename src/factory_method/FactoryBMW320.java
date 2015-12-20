package factory_method;

import simple_factory.BMW320;

public class FactoryBMW320 implements FactoryBMW {

	public BMW320 createBMW() {
		return new BMW320();
	}

}
