package edu.kis.vh.stacks.factory;

import edu.kis.vh.stack.implementations.StackArray;
import edu.kis.vh.stack.implementations.StackList;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class ArrayStackFactory implements IStacksFactory {

	@Override
	public Stack getStandardStack() {
		StackArray stack = new StackArray();
		return new Stack(stack);
	}

	@Override
	public Stack getFalseStack() {
		StackList stack = new StackList();
		return new Stack(stack);
	}

	@Override
	public StackFIFO getFIFOStack() {
		StackArray stack = new StackArray();
		return new StackFIFO(stack);
	}

	@Override
	public StackHanoi getHanoiStack() {
		StackArray stack = new StackArray();
		return new StackHanoi(stack);
	}

}
