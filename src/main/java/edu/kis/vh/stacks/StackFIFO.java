package edu.kis.vh.stacks;

import edu.kis.vh.stack.implementations.StackList;
import edu.kis.vh.stacks.StackInterface;


//komentarz do 14: Lepszy będzie wybór StackList - brak ograniczenia na rozmiar stosu

/**
 * @author Mateusz Śmiałkowski
 * Implementacja stosu FIFO (First In First Out)
 */
public class StackFIFO extends Stack {

	private final StackInterface temp = new StackList();
	
	public StackFIFO() {
		super();
	}

	public StackFIFO(StackInterface stackImpl) {
		super(stackImpl);
	}
	
	@Override
	public int pop() {
		while (isEmpty()!=edu.kis.vh.stacks.StackInterface.EMPTY_CODE)
			temp.pushElement(super.pop());
		
		int result = temp.pop();
		
		while (temp.empty()!=edu.kis.vh.stacks.StackInterface.EMPTY_CODE)	
			push(temp.pop());
		
		return result;
	}
}
