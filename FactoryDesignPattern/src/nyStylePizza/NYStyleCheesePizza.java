package nyStylePizza;

import abstractClasses.Pizza;

public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() {
		/*these fields are extended from Pizza
		 * */
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
	
}
