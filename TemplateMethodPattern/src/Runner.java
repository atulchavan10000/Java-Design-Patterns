
public class Runner {
	public static void main(String args[]) {
		Tea myTea = new Tea();
		Coffee myCoffee = new Coffee();
		
		System.out.println("Making Tea...");
		myTea.prepareRecipe();
		
		System.out.println("Making coffee...");
		myCoffee.prepareRecipe();
	}
}
