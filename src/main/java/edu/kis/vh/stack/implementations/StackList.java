package edu.kis.vh.stack.implementations;

import edu.kis.vh.stacks.StackInterface;

/**
 * @author Mateusz Śmiałkowski
 * Implementacja listy węzłów
 */
public class StackList implements StackInterface {

	
	private Node last;


	@Override
	public void pushElement(int value) {
		if (last == null)
			last = new Node(value);
		else {
			last.setNext(new Node(value));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}


	@Override
	public int empty() {
		if( last == null){return EMPTY_CODE;}
		else return NOT_EMPTY_CODE;
	}

	@Override
	public boolean full() {
		return false;
	}


	@Override
	public int peek() {
		if (empty()==EMPTY_CODE)
			return EMPTY_CODE;
		return last.getValue();
	}


	@Override
	public int pop() {
		if (empty()==EMPTY_CODE)
			return EMPTY_CODE;
		int result = last.getValue();
		last = last.getPrev();
		return result;
	}
	
	@Override
	public int total() {
		Node current = last;
		int total = 0;
		while(current != null){
			total++;
			current = current.getPrev();
		}
		return total;
	}

	private class Node {

		//w pozostałych klasach jest teraz używane za pomocą gettera
		private final int value;
		
		//w pozostałych klasach jest teraz używane za pomocą gettera i settera
		private Node prev;
		
		//w pozostałych klasach jest teraz używane za pomocą gettera i settera
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}	
	}
}


