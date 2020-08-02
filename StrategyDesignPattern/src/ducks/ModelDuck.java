package ducks;

import concreteImplementations.FlyNoWay;
import concreteImplementations.Quack;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
