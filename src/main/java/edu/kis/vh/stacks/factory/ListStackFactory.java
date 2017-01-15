package edu.kis.vh.stacks.factory;

import edu.kis.vh.stack.implementations.StackArray;
import edu.kis.vh.stack.implementations.StackList;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class ListStackFactory implements IStacksFactory {

	@Override
	public Stack getStandardStack() {
		StackList stack = new StackList();
		return new Stack(stack);
	}

	@Override
	public Stack getFalseStack() {
		StackArray stack = new StackArray();
		return new Stack(stack);
	}

	@Override
	public StackFIFO getFIFOStack() {
		StackList stack = new StackList();
		return new StackFIFO(stack);
	}

	@Override
	public StackHanoi getHanoiStack() {
		StackList stack = new StackList();
		return new StackHanoi(stack);
	}

}
