package creatorClasses;
import products.ChicagoStyleCheesePizza;
import products.Pizza;


//createPizza method is factory method which will create objects (products),
//clases that produce products are called concrete creators,
//so this class is a concrete creator
//Concrete creators can encapsulate the knowledge about the products it creates
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
