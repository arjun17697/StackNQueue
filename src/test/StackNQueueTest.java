package test;

import static org.junit.Assert.*;

import org.junit.Test;


import main.StackNQueueMain;

public class StackNQueueTest {

	@Test
	public void LastNumberAddedtoStackShouldBeAtTopNode() {
		// create Object of Implementing class 
		StackNQueueMain obj = new StackNQueueMain(); 
		// insert Stack value 
		obj.push(70);
		obj.push(30); 
		obj.push(56);
		int test1 = obj.peek();
		assertEquals(56, test1);
	}
	
	@Test
	public void PoppedNumberShouldMatchWithLastAddedNode() {
		// create Object of Implementing class 
		StackNQueueMain obj = new StackNQueueMain(); 
		// insert Stack value 
		obj.push(70);
		obj.push(30); 
		obj.push(56);
		int test2 = obj.pop();
		assertEquals(56, test2);
	}
}