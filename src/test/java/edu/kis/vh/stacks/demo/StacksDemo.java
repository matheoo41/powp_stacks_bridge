package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackInterface;
import edu.kis.vh.stacks.factory.ArrayStackFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.ListStackFactory;

//alt + <- przejście do poprzedniego pliku z historii, który był otwarty
//alt + -> przejście do kolejnego pliku z historii, który był otwarty

class StacksDemo {

	public static void main(String[] args) {
		IStacksFactory[] factories = { new DefaultStacksFactory(), new ArrayStackFactory(), new ListStackFactory() };
		for(IStacksFactory factory : factories){
			testStacks(factory);
			System.out.println();
		}
	}

	private static void testStacks(IStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random random = new java.util.Random(); // złe wcięcie
		for (int i = 1; i < 15; i++) // złe wcięcie
			stacks[3].push(random.nextInt(20));

		for (int i = 0; i < stacks.length; i++) { // złe wcięcie
			while (stacks[i].isEmpty()!=edu.kis.vh.stacks.StackInterface.EMPTY_CODE)
				System.out.print(stacks[i].pop() + "  ");
			System.out.println(); // złe wcięcie
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

}