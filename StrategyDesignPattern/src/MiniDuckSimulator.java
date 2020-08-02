import concreteImplementations.FlyRocketPowered;
import ducks.Duck;
import ducks.MallardDuck;
import ducks.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		// This calls the MallardDucks inherited
		// performQuack() method, which then delegates
		// to the objects QuackBehavior (ie. calls quack() on
		// the ducks inherited quackBehavior reference)
		mallard.performQuack();
		
		// then we do the same thing with MallardDucks
		// inherited performFly() method
		mallard.performFly();
		
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
