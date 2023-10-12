//Ousama M Batais
//CS 3345
//Prof. Omar Hamdy

import java.util.EmptyStackException;
import java.util.Iterator;

// Using singly linked list to store values in a stack
public class ListStack implements BKStack, Iterable<Double> {

	private Node top;
	private int count;

	// represents the nodes in the linked list
	private class Node {
		double item;
		Node next;
		Node(double value) {
			this.item = value;
		}
	}

	/* adds value to stack by creating a new node and setting top to this new node
	 * next is set to the previous top node
	 * count is increased by 1
	 */
	public void push(double value) {
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
		count++;
	}

	/* removes the top element and return it from the stack by getting the top value
	 * top is set to the next node in list and count is decreased by 1
	 * if the stack is empty, an exception is thrown 
	 */
	public double pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		double value = top.item;
		top = top.next;
		count--;
		return value;
	}

	// return top element from stack while not removing it
	// if the stack is empty, an exception is thrown
	@Override
	public double peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.item;
	}

	// return true if stack is empty, otherwise returns false
	public boolean isEmpty() {
		return top == null;
	}

	// returns number of elements in the stack
	@Override
	public int count() {
		// TODO Auto-generated method stub
		int count = 0; // Initialize a count variable to 0
        // Here I used an enhanced for-loop to count the elements
        for (double element : this) {
            count++;
        }
		return count;
	}
	// this returns an Iterator object to be used over the elements in stack. 
	public Iterator<Double> iterator() {
		return new ListStackIterator();
	}
	// private class implements the iterator
	public class ListStackIterator implements Iterator<Double> {
		private Node current = top;

		// if current node is not null (it means there is a node in the list), 
		// it should return true
		public boolean hasNext() {
			return current != null;
		}

		// will return the value of the current node, and moves it to the next node
		public Double next() {
			// if there's no more nodes, an exception is thrown
			if (!hasNext()) {
				throw new java.util.NoSuchElementException();
			}
			Double value = (Double) current.item;
			current = current.next;
			return value;
		}

		// throws an exception because remove is not supported
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

}