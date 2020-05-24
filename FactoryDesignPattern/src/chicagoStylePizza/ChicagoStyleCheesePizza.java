package chicagoStylePizza;

import abstractClasses.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		name = "Chicago style deep dish cheese pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";
		toppings.add("Shredded mozzerella cheese");		
	}
	
	//the chicago style pizza also overrides the cut()
	protected void cut() {
		System.out.println("cutting the pizza into square slices");
	}
}
