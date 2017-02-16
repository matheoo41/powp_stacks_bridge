package edu.kis.vh.stacks;
import edu.kis.vh.stacks.StackInterface;


/**
 * @author Mateusz Śmiałkowski
 * Implementacja stosu opartego na wieży Hanoi
 */
public class StackHanoi extends Stack {

	private static final int INIT_TOTAL_REJECTED = 0;
	private int totalRejected = INIT_TOTAL_REJECTED;
	
	public StackHanoi() {
		super();
	}

	public StackHanoi(StackInterface stackImpl) {
		super(stackImpl);
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int value) {
	if ((isEmpty()!=edu.kis.vh.stacks.StackInterface.EMPTY_CODE) && value > top())
		totalRejected++;
		else
			super.push(value);
	}
}
