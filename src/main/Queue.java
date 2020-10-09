package main;

//Linked List Part
class Node {
	int key;
	Node next;

	public Node(int key) {
		this.key = key;
		this.next = null;
	}
}
//A class to represent a queue 
class Queue {
	Node front, rear;

	public Queue() {
		this.front = this.rear = null;
	}

// Enqueue
	void enqueue(int key) {
		Node temp = new Node(key);

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

// Dequeue
	void dequeue() {
		// If queue is empty
		if (isEmpty())
			return;

		// Store previous front and move front one node ahead
		Node temp = this.front;
		this.front = this.front.next;

		// If front becomes NULL, then change rear also as NULL
		if (this.front == null)
			this.rear = null;
	}




	public static void main(String[] args) {
			
	}
}