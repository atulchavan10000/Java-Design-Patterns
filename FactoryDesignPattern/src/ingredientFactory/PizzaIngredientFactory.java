package ingredientFactory;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Veggies;

/* PizzaIngredientFactory is an abstract factory which 
 * provides an interface for a family of products. In our case,
 * the family is all things we need to make a pizza
 * e.g. dough, sauce, cheese, meats and veggies.
 * 
 * Note that all methods below are factory methods, they create objects
 * through inheritance and Abstract Factory creates object 
 * through object composition.
 * */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
