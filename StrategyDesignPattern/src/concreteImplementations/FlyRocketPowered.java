package concreteImplementations;

import behaviorInterfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{
	public void fly() {
		System.out.println("I'm flying with a Rocket");
	}
}
