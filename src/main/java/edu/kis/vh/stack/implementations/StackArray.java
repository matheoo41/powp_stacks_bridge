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
		if (empty())
			return EMPTY_CODE;
		return items[--total];
	}

	@Override
	public void pushElement(int value) {
		if (!full())
			items[total++] = value;	
	}

	@Override
	public boolean empty() {
		return total == 0;
	}

	@Override
	public boolean full() {
		return total == INIT_SIZE;
	}

	@Override
	public int peek() {
		if (empty())
			return EMPTY_CODE;
		return items[total-1];
	}
}
