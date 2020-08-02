package ducks;
import concreteImplementations.FlyWithWings;
import concreteImplementations.Quack;


// Remember, mallardDuck inherits the quackBehavior and flyBehavior
// instance variables from the class Duck
public class MallardDuck extends Duck {
	
	// MallardDuck uses the Quack
	// class to handle its quack, so when 
	// performQuack() is called, the 
	// responsibility for the quack is delegated
	// to the Quack object and we get a real quack.
	// And it uses FlyWithWings as its
	// FlyBehavior type
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard Duck");
	}
}
