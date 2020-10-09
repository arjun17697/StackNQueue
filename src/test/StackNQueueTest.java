package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.StackNQueueMain;

public class StackNQueueTest {

	@Test
	public void LastNumberAddedtoStackShouldBeAtFirstNode() {
		
		// create Object of Implementing class 
		StackNQueueMain obj = new StackNQueueMain(); 
		// insert Stack value 
		obj.push(70);
		obj.push(30); 
		obj.push(56);
		int test1 = obj.peek();
		assertEquals(56, test1);
	}

}
