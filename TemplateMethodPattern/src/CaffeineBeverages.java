/*
 * The Hollywood Principle - 'Dont call us, we will call you'
 * CaffeineBeverages is our high-level component, it has control over the
 * algorithm for the recipe, and call on the subclasses only when they are
 * needed for an implementation of a method.
 * 
 * Clients of beverages will depend of CaffeineBeverages abstraction
 * rather than a concrete Tea of Coffee, which reduces dependencies
 * in the overall system.
 * */
public abstract class CaffeineBeverages {
	
	/* This is the Template Method
	 * */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();			
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring in Cup");
	}
	
	/*
	 * We can have concrete methods that do nothing
	 * by default, we call these "hooks" Subclasses are free
	 * to override these but dont have to.
	 * Hook method is declared in the abstract class,
	 * but only given an empty or default implementation.
	 * */
	public boolean customerWantsCondiments() { 
		return true;
	}
}
