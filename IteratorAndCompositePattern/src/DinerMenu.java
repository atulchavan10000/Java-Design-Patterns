
// Mel's implementation of the Diner menu
public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	
	/* Mel takes a different approach, he is using an Array
	 * so he can control the max size of the menu
	 * */
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT",
				"(Fakin') Becaon with lettuce & tomato on whole wheat",
				true,
				2.99);
	}
	
	/* addItem() takes all the parameters necessary to create
	 * a MenuItem and instantiates one. It also checks to make sure
	 * we havent hit the menu size limit
	 * */
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to menu");
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}
	
	/* The createIterator() method creates a DinerMenuIterator
	 * from the menuItems array dn returns it to the client
	 * */
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}




















