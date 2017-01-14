package edu.kis.vh.stacks.list;

/**
 * @author Mateusz Śmiałkowski
 * Implementacja stosu opartego na liście węzłów
 */
public class StackList {

	private static final int EMPTY_CODE = -1;
	private Node last;

	public void pushElement(int value) {
		if (last == null)
			last = new Node(value);
		else {
			last.setNext(new Node(value));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY_CODE;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return EMPTY_CODE;
		int result = last.getValue();
		last = last.getPrev();
		return result;
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


