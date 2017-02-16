package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stack.implementations.StackArray;
import edu.kis.vh.stacks.StackInterface;

public class StackArrayTest {
	@Test
	public void testPush() {
		StackArray stackObj = new StackArray();
		int testValue = 4;
		stackObj.pushElement(testValue);
		
		int result = stackObj.peek();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		StackArray stackObj = new StackArray();
		boolean result = stackObj.empty();		
		Assert.assertEquals(true, result);
		
		stackObj.pushElement(888);
		
		result = stackObj.empty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		StackArray stackObj = new StackArray();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.full();		
			Assert.assertEquals(false, result);
			stackObj.pushElement(888);
		}
		
		boolean result = stackObj.full();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		StackArray stackObj = new StackArray();
		final int EMPTY_STACK_VALUE = StackInterface.EMPTY_CODE;
		
		int result = stackObj.peek();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.pushElement(testValue);
		
		result = stackObj.peek();
		Assert.assertEquals(testValue, result);
		result = stackObj.peek();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		StackArray stackObj = new StackArray();
		final int EMPTY_STACK_VALUE = StackInterface.EMPTY_CODE;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.pushElement(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
}
