package beverages;

import abstractClasses.Beverage;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	public double cost() {
		return .99;
	}
}
