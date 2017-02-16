package edu.kis.vh.stack.implementations;

import edu.kis.vh.stacks.StackInterface;

public class StackArray implements StackInterface{
	
	private static final int INIT_SIZE = 12;	
	private final int[] items = new int[INIT_SIZE];
	private int total = 0;

	@Override
	public int total() {
		return total;
	}

	@Override
	public int pop() {
		if (empty()==EMPTY_CODE)
			return EMPTY_CODE;
		return items[--total];
	}

	@Override
	public void pushElement(int value) {
		if (!full())
			items[total++] = value;	
	}

	@Override
	public int empty() {
		if(total==0){return EMPTY_CODE;}
		else return NOT_EMPTY_CODE;
	}

	@Override
	public boolean full() {
		return total == INIT_SIZE;
	}

	@Override
	public int peek() {
		if (empty()==EMPTY_CODE)
			return EMPTY_CODE;
		return items[total-1];
	}
}
