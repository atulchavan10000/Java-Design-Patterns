package ingredientFactory;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Veggies;

// In Abstract Factory(PizzaIngredientFactory), each ingredient factory is a Concrete Factory
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}
	
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion, new Mashroom(), new RedPepper() };
		return veggies;
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClam() {
		return new FreshClams();
	}


	
}
