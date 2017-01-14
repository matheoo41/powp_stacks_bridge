package edu.kis.vh.stacks;

/**
 * @author Mateusz Śmiałkowski
 * Implementacja stosu FIFO (First In First Out)
 */
public class StackFIFO extends Stack {

	private final Stack temp = new Stack();
	
	@Override
	public int pop() {
		while (!isEmpty())
		
		temp.push(super.pop());
		
		int result = temp.pop();
		
		while (!temp.isEmpty())
	
		push(temp.pop());
		
		return result;
	}
}
