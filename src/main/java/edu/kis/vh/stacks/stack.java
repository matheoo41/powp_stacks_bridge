package edu.kis.vh.stacks;

import edu.kis.vh.stack.implementations.StackArray;

//komentarz do punktu 13: Deklaracje metod znajdują się w interfejsie. Istnieją dwie klasy implementujące ten interfejs StackArray, StackList

/**
 * @author Mateusz Śmiałkowski
 * Podstawowa implementacja stosu
 */
public class Stack {

	private final StackInterface stackImpl;

	public Stack() {
		super();
		this.stackImpl = new StackArray();
	}
	
	public Stack(StackInterface stackImpl) {
		super();
		this.stackImpl = stackImpl;
	}

	public void push(int value) {
		stackImpl.pushElement(value);
	}

	public boolean isEmpty() {
		return stackImpl.empty();
	}

	public boolean isFull() {
		return stackImpl.full();
	}

	public int top() {
		return stackImpl.peek();
	}

	public int getTotal() {
		return stackImpl.total();
	}

	public int pop() {
		return stackImpl.pop();
	}

}
