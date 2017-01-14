package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;

public class StackHanoiTest {
	@Test
	public void testPush() {
		Stack stackObj = new StackHanoi();
		int testValue = 4;
		stackObj.push(testValue);		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
		
		stackObj.push(testValue + 1);		
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		
		stackObj.push(testValue - 1);		
		result = stackObj.top();
		Assert.assertEquals(testValue - 1, result);
	}
	
	@Test
	public void testReportRejected() {
		StackHanoi stackObj = new StackHanoi();
		int testValue = 4;
		stackObj.push(testValue);		
		int result = stackObj.reportRejected();
		Assert.assertEquals(0, result);
		
		stackObj.push(testValue + 1);		
		result = stackObj.reportRejected();
		Assert.assertEquals(1, result);
		
		stackObj.push(testValue - 1);		
		result = stackObj.reportRejected();
		Assert.assertEquals(1, result);
	}
}
