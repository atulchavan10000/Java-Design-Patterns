
public class MiniDuckSimiluator {
	public static void main(String[] args) {
		/*using Duck class polymorphically
			Multiple subclasses that inherit from super class
			can override behavior in the super class by 
			providing unique implementations for the methods 
			defined in the super class
			https://documentation.progress.com/output/ua/OpenEdge_latest/index.html#page/dvoop/using-polymorphism-with-classes.html		
		*/
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		mallard.setFlyBehavior(new FlyNoWay());
		mallard.performFly();
	}
}
