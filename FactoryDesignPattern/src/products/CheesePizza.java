package products;

import ingredientFactory.PizzaIngredientFactory;

//factories create products, and this class is a product,
//created by createPizza factory method, these classes are called concrete products
public class CheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	// The prepare() method steps through creating
	// a cheese pizza, and each time it needs an
	// ingredient, it asks the factory to produce it
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
	
}
