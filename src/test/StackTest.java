package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.StackMain;

public class StackTest {

	@Test
	public void LastNumberAddedtoStackShouldBeAtFirstNode() {
		// create Object of Implementing class 
		StackMain obj = new StackMain(); 
		// insert Stack value 
		obj.push(70);
		obj.push(30); 
		obj.push(56);
		int test1 = obj.peek();
		assertEquals(56, test1);
	}

	@Test
	public void LastNumberAddedShouldPopFirst() {
		// create Object of Implementing class 
		StackMain obj = new StackMain(); 
		// insert Stack value 
		obj.push(70);
		obj.push(30); 
		obj.push(56);
		obj.pop();
		int test1 = obj.peek();
		assertEquals(30, test1);
	}}