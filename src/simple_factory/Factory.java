package simple_factory;

public class Factory {

	public BMW CreateBMW(int type){
		switch (type) {
		case 320:
			return new BMW320();
		case 523:
			return new BMW523();
		default:  
			break; 
		}
		return null;
	}

}
