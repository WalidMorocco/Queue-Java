package mypackage;

public class Driver {

	public static void main(String[] args) {
		// Create Queue
		Queue queue = new Queue();
		
		// Add Integers to the Queue
		queue.enqueue(new Integer(7));
		queue.enqueue(new Integer(10));
		queue.enqueue(new Integer(-3));
		
		// Remove first element of the Queue
		queue.dequeue();
		
		// Print the first element of the queue
		System.out.println(queue.firstEl());
	}

}
