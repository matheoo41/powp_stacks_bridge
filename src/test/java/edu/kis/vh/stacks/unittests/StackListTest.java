package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.list.StackList;


public class StackListTest {
	@Test
	public void testPush() {
		StackList stackListObj = new StackList();
		int testValue = 4;
		stackListObj.pushElement(testValue);
		
		int result = stackListObj.peek();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		StackList stackListObj = new StackList();
		boolean result = stackListObj.empty();		
		Assert.assertEquals(true, result);
		
		stackListObj.pushElement(888);
		
		result = stackListObj.empty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		StackList stackListObj = new StackList();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackListObj.full();		
			Assert.assertEquals(false, result);
			stackListObj.pushElement(888);
		}
		
		boolean result = stackListObj.full();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testPeek() {
		StackList stackListObj = new StackList();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackListObj.peek();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackListObj.pushElement(testValue);
		
		result = stackListObj.peek();
		Assert.assertEquals(testValue, result);
		result = stackListObj.peek();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		StackList stackListObj = new StackList();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackListObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackListObj.pushElement(testValue);
		
		result = stackListObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackListObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
}
