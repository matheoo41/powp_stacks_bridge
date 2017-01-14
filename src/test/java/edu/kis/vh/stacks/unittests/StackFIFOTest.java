package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;

public class StackFIFOTest {
	
	@Test
	public void testPop() {
		Stack stackObj = new StackFIFO();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		stackObj.push(testValue + 1);
		stackObj.push(testValue + 2);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(testValue + 1, result);
		result = stackObj.pop();
		Assert.assertEquals(testValue + 2, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
}
