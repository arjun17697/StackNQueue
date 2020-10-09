package main;

//Linked List Part
class NodeMain {
	int key;
	NodeMain next;

	public NodeMain(int key) {
		this.key = key;
		this.next = null;
	}
}
//A class to represent a queue 
public class QueueMain {
	NodeMain front, rear;

	public QueueMain() {
		this.front = this.rear = null;
	}

// Enqueue
	public void enqueue(int key) {
		NodeMain temp = new NodeMain(key);

		// If queue is empty, then new node is front and rear both
		if (isEmpty()) {
			this.front = this.rear = temp;
			return;
		}

		// Add the new node at the end of queue and change rear
		this.rear.next = temp;
		this.rear = temp;
	}
//Method to check if the queue is empty	isEmpty()
	public boolean isEmpty() {
		return rear == null;
	}
	
	public int peek() {
		// check for empty stack
		if (!isEmpty()) {
			return front.key;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

public static void main(String[] args) {
	System.out.println("Welcome to Queue App");
			}
}