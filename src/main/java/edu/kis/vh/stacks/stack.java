package edu.kis.vh.stacks;

/**
 * @author Mateusz Śmiałkowski
 * Podstawowa implementacja stosu
 */
public class Stack {

	private static final int EMPTY_CODE = -1;
	private static final int INIT_SIZE = 12;
	
	private final int[] ITEMS = new int[INIT_SIZE];

	private int total = EMPTY_CODE;

	public void push(int value) {
		if (!isFull())
			ITEMS[++total] = value;
	}

	public boolean isEmpty() {
		return total == EMPTY_CODE;
	}

	public boolean isFull() {
		return total == INIT_SIZE - 1;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_CODE;
		return ITEMS[total];
	}

	public int getTotal() {
		return total;
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_CODE;
		return ITEMS[total--];
	}

}
