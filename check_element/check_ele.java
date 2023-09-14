package check_element;
import java.util.LinkedList;

class SearchInALinkedList {
	public static void main(String[] args)
	{
		// Initializing the Linked List
		LinkedList<Integer> ll = new LinkedList<>();

		// Adding elements to the Linked List
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);

		// Element to be searched
		int element = 4;

		// Initializing the answer to the index -1
		int ans = -1;

		// Traversing through the Linked List
		for (int i = 0; i < ll.size(); i++) {

			// Eztracting each element in
			// the Linked List
			int llElement = ll.get(i);

			// Checking if the extracted element is equal to
			// the element to be searched
			if (llElement == element) {

				// Assigning the index of the
				// element to answer
				ans = i;
				break;
			}
		}
		// Checking if the element is present in the Linked
		// List
		if (ans == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println(
				"Element found in Linked List at " + ans);
		}
	}
}
