package franchisePizzaStores;
import abstractClasses.Pizza;
import abstractClasses.PizzaStore;
import chicagoStylePizza.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore{
	
	//we need to implement createPizza(), since it is abstract in PizzaStore
	protected Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
//		}else if(item.equals("veggie")) {
//			return new NYStyleVeggiePizza();
//		}else if(item.equals("clam")) {
//			return NYStyleClamPizza();
//		}else if(item.equals("pepperoni")) {
//			return new NYStylePepperoniPizza();
		}else return null;
	}
}
