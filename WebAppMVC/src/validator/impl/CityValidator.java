package validator.impl;

import domain.City;
import validator.Validator;

public class CityValidator implements Validator{

	@Override
	public void validateObject(Object object) throws Exception {
		if(! (object instanceof City)) {
			throw new Exception("Not valid object");
		}
		City city=(City) object;
		if(city.getName().isEmpty()) throw new Exception("Name can not be empty");
		if(city.getPtt().isEmpty()) throw new Exception("PTT can not be empty");
		
	}
}
