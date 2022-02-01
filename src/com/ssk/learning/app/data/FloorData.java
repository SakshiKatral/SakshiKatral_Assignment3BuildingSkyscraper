package com.ssk.learning.app.data;

import java.util.Scanner;
import java.util.Stack;

public class FloorData {
	Scanner scanner = new Scanner(System.in);
	int size = 0;
	int[] array;

	public int[] getDataFromUser() {

		System.out.println("Enter the total number of floors in the building");
		size = scanner.nextInt();
		array = new int[size];

		if(size > 0){
			for(int i = 0; i < size; i++) {
				System.out.println("Enter the floor size given on day : " + (i+1));
				int floor = scanner.nextInt();
				
				if(floor <= size && floor > 0) {
					array[i] = floor;
					int count = 0;
					
					for(int j = 0; j <= i; j++) {
						for(int k = j + 1; k <= i; k++) {
							if(array[j] == array[k]) {
								System.out.println("This floor size is already built ");
								count++;
							}
							else{
								array[i] = floor;
							}
						}
					}
					
					if(count == 1) {
						i--;
					}
				}
				else{
					System.out.println("Enter valid floor number");
					i--;	
				}
			}
			System.out.println("The order of construction is as follows");
		}
		else {
			System.out.println("Please enter valid number of floors");
			getDataFromUser();
		}
		return array;
	}
}
