package edu.kis.vh.stacks;

//do punktu 11. zmiana ograniczyła się tylko do zmiany pola EMPTY_CODE w interfejsie

public interface StackInterface {

	static final int EMPTY_CODE = 0;
	static final int NOT_EMPTY_CODE = 1;
	
	void pushElement(int value);

	int empty();

	boolean full();

	int peek();

	int pop();

	int total();
}