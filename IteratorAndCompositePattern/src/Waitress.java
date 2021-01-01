import java.util.ArrayList;
import java.util.Iterator;
public class Waitress {
	ArrayList<Menu> menus;
	
	/* The PancakeHouseMenu and DinerMenu classes implement an interface, Menu
	 * Waitress can refer to each menu object using the interface rather than 
	 * the concrete class. So, we're reducing the dependency between the Waitress
	 * and the concrete classes by "programming to an interface, not an implementation"
	 * This solves the problem of Waitress depending on the concrete Menus.
	 * */
	

	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}
	
	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		
		while(menuIterator.hasNext()) {
			Menu menu = menuIterator.next();
			printMenu(menu.createIterator());
		}
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
