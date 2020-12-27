import java.util.Iterator;

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
	
	/* Since the chef is using a fixed-size Array, we just shift all the 
	 * elements up one and make the last element null, when remove() is called
	 * */
	public void remove() {
		if(position <= 0) {
			throw new IllegalStateException
				("You cant remove an item until you've done at least one next()");
		}
		if(items[position - 1] != null) {
			for(int i = position - 1; i < items.length - 1; i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}
	
	
}
















