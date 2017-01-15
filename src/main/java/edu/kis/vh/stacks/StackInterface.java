package edu.kis.vh.stacks;

//do punktu 11. zmiana ograniczyła się tylko do zmiany pola EMPTY_CODE w interfejsie

public interface StackInterface {

	static final int EMPTY_CODE = 0;
	
	void pushElement(int value);

	boolean empty();

	boolean full();

	int peek();

	int pop();

	int total();
}