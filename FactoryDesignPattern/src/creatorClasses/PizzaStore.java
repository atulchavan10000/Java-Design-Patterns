package creatorClasses;

import products.Pizza;

public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
	/* Subclasses i.e. regional pizza stores will override this method
	 * Subclasses of PizzaStore will handle the object
	 * instantiation in the createPizza factory method and encapsulate the
	 * creation in subclasses. This decouples the client code in the superclass
	 * from the object creation code in the subclass
	 * createPizza method is the abstract factory method here
	 * */
	protected abstract Pizza createPizza(String type);
}
