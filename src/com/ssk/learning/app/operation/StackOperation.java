package com.ssk.learning.app.operation;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackOperation {

	Stack<Integer> stack = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	public void buildingSkyscraper(int[] array, int noFloor) {

		for (int i = (array.length - 1); i >= 0; i--) {
			stack.push(array[i]);
		}

		
		int temp = stack.size();

		for(int i = 1; i <= noFloor ; i++) {
			try{
				if(stack.peek() >= temp) {
					stack2.push(stack.pop()); 
					System.out.println("\nDay : " + i);

					while(stack2.peek() >= temp ){
						try {
							System.out.print(stack2.pop() + " ");
						}
						catch (EmptyStackException e) {
							System.out.println();
						}
						temp = (temp - 1);
					}
				}
				else {
					System.out.println("\nDay : " + i);
					stack2.push(stack.pop());	
				}
				if(stack.isEmpty() == true){
					while(!stack2.empty()){
						System.out.print(stack2.pop() + " ");
					}
				}	
			}
			catch (EmptyStackException e) {
				System.out.println();
			}
		}
	}
}		

