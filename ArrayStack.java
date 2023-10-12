//Ousama M Batais
//CS 3345
//Prof. Omar Hamdy

import java.util.EmptyStackException;


public class ArrayStack implements BKStack {

	private double[] data; // store values to the stack
	private int top; // add integer to keep track of top element

	public static final int INITIAL_CAPACITY = 10; // default initial capacity

	public ArrayStack() {
		data = new double[INITIAL_CAPACITY];
		top = -1;
	}

	// adds value to the stack by increasing top by 1 and 
	// assigning the value to data[top] (the corresponding index)
	public void push(double value) {
		if (top == data.length - 1) {
			resize();
		}
		top++;
		data[top] = value;
	}

	// removes the top element and return from the stack by decreasing top by 1
	// and getting the value at data[top] (the corresponding index)
	public double pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		double value = data[top];
		top--;
		return value;
	}

	// return the top element without removing it
	// and if the stack's empty an exception is thrown
	@Override
	public double peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return data[top];
	}

	// return true if stack is empty, otherwise returns false
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	// return number of elements in the stack
	public int count() {
		// TODO Auto-generated method stub
		return top + 1;
	}

	// creates new array with double the size, copies the elements from current array to new array
	private void resize() {
		double[] newData = new double[data.length * 2];
		System.arraycopy(data, 0, newData, 0, data.length);
		data = newData;
	}
}
