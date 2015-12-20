package factory_method;

import simple_factory.BMW523;

public class FactoryBMW523 implements FactoryBMW{

	public BMW523 createBMW() {
		return new BMW523();
	}

}
