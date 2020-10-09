package test;

import static org.junit.Assert.*;

import java.util.Queue;

import org.junit.Test;

import main.StackMain;
import main.QueueMain;

public class QueueTest {

	@Test
	public void FirstNumberAddedtoQueueShouldBeAtFirstNode() {
		// create Object of Implementing class 
		QueueMain obj1 = new QueueMain(); 
		// insert Queue value 
		obj1.enqueue(70);
		obj1.enqueue(30);
		obj1.enqueue(56);
		int test1 = obj1.peek();
		assertEquals(70, test1);
	}

}
