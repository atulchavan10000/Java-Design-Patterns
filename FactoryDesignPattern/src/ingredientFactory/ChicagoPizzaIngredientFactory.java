package ingredientFactory;

import ingredients.Cheese;
import ingredients.Clams;
import ingredients.Dough;
import ingredients.Pepperoni;
import ingredients.Sauce;
import ingredients.Veggies;

//In Abstract Factory(PizzaIngredientFactory), each ingredient factory is a Concrete Factory
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies = { new Spinach(), new BlackOlives(), new EggPlant() };
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return FrozenClam();
	}
	
}
