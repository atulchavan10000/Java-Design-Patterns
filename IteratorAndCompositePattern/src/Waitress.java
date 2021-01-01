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
	Menu cafeMenu;
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
		
		System.out.println("\nDINNER");
		printMenu(cafeIterator);
	}
	
	public void printMenu(Iterator<MenuItem> iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getDescription() + ", ");
			System.out.println(menuItem.getPrice());
			
			
		}
	}
}
