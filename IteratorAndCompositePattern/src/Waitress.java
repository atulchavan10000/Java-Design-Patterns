import java.util.Iterator;
public class Waitress {
	
	/* The PancakeHouseMenu and DinerMenu classes implement an interface, Menu
	 * Waitress can refer to each menu object using the interface rather than 
	 * the concrete class. So, we're reducing the dependency between the Waitress
	 * and the concrete classes by "programming to an interface, not an implementation"
	 * This solves the problem of Waitress depending on the concrete Menus.
	 * */
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
	}
	
	public void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getDescription() + ", ");
			System.out.println(menuItem.getPrice());
			
			
		}
	}
}
