package condimentDecorators;
import abstractClasses.Beverage;
import abstractClasses.CondimentDecorator;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + .15;
	}
	
}
