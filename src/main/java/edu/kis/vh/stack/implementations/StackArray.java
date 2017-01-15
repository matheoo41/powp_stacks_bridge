package edu.kis.vh.stack.implementations;

import edu.kis.vh.stacks.StackInterface;

public class StackArray implements StackInterface{
	
	private static final int INIT_SIZE = 12;	
	private final int[] ITEMS = new int[INIT_SIZE];
	private int total = EMPTY_CODE;

	@Override
	public int total() {
		return total;
	}

	@Override
	public int pop() {
		if (empty())
			return EMPTY_CODE;
		return ITEMS[--total];
	}

	@Override
	public void pushElement(int value) {
		if (!full())
			ITEMS[total++] = value;	
	}

	@Override
	public boolean empty() {
		return total == EMPTY_CODE;
	}

	@Override
	public boolean full() {
		return total == INIT_SIZE;
	}

	@Override
	public int peek() {
		if (empty())
			return EMPTY_CODE;
		return ITEMS[total-1];
	}
}
