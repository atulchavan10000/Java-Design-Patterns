package creatorClasses;
import ingredientFactory.NYPizzaIngredientFactory;
import ingredientFactory.PizzaIngredientFactory;
import products.CheesePizza;
import products.ClamPizza;
import products.Pizza;

// createPizza method is factory method which will create objects (products),
// clases that produce products are called concrete creators,
// so this class is a concrete creator
// Concrete creators can encapsulate the knowledge about the products it creates
// The subclasses (CheesePizza, ClamPizza) are instantiated by the Factory Method createPizza()
public class NYPizzaStore extends PizzaStore{
	
	//we need to implement createPizza(), since it is abstract in PizzaStore
	
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(item.equals("cheese")) {
			// this is composition
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if(item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
			
		return pizza;
	}
}
