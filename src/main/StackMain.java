
package main;

import static java.lang.System.exit;

public class StackMain {
	public static void main(String[] args) {
		System.out.println("Welcome to StackNQueueApp");
		}



// A linked list node 
	private class Node {
		int data;
		Node link;
	}

	Node top;
	// constructor
	public StackMain() {
		this.top = null;
	}

//Push Method for Stack
	public void push(int x) {
		Node temp = new Node();
		if (temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}
		temp.data = x;
		temp.link = top;
		top = temp;
	}

// Method to check if the stack is empty or not
	public boolean isEmpty() {
		return top == null;
	}

	public void display() {
		// check for stack underflow
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		} else {
			Node temp = top;
			while (temp != null) {

				// print node data
				System.out.printf("%d->", temp.data);

				// assign temp link to temp
				temp = temp.link;
			}
		}
	}

	// Method to return top element in a stack
	public int peek() {
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	// Method to pop top element from the stack
	public void pop() {
		// check for stack underflow
		if (top == null) {
		System.out.println("Stack Underflow");
		}
		// update the top pointer to point to the next node
		top = (top).link;
		
	}
	

}

