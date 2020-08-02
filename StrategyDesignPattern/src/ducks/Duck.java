package ducks;
import behaviorInterfaces.FlyBehavior;
import behaviorInterfaces.QuackBehavior;

public abstract class Duck {
	// This is object composition.
	// Each duck has a FlyBehavior and a QuackBehavior
	// to which it delegates flying and quacking.
	// When you put two classes together like this you are
	// using composition
	// Instead of inheriting their behavior, the ducks get their
	// behavior by being composed with the right behavior object.
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		// Rather than handling the quack
		// behavior itself, the Duck object
		// delegates that behavior to the object
		// referenced by quackBehavior.
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
