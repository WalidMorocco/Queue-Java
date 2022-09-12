package mypackage;

public class Queue {
	private java.util.LinkedList<Object> queue = new java.util.LinkedList<Object>();
	
	// Constructor
	public Queue() {
		
	}
	
	// Clear the Queue
	public void clear() {
		queue.clear();
	}
	
	// Return if the Queue is empty or not
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	// Return the Object at the start of the Queue (First Object)
	public Object firstEl() {
		return queue.getFirst();
	}
	
	// Remove the Object at the start of the Queue
	public Object dequeue() {
		return queue.removeFirst();
	}
	
	// Add an Object to the Queue
	public void enqueue(Object el) {
		queue.addLast(el);
	}
	
}
