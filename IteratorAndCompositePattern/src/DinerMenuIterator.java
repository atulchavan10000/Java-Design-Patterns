
public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
	
	/* The constructor takes the array of new
	 * items we are going to iterate over
	 * */
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	/* Because the diner chef went ahead and allocated a max
	 * sized array, we need to check not only if we are at the 
	 * end of the array, but also if the next item is null, 
	 * which indicates there are so many items
	 * */
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		}else {
			return true;
		}
	}
	
	/*
	 * The next() method returns the next item in
	 * the array and increments the position
	 * */
	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}
}

