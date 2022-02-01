package com.ssk.learning.app.main;

import java.util.Scanner;

import com.ssk.learning.app.data.FloorData;
import com.ssk.learning.app.operation.StackOperation;

public class BuildingSkyscraper {
	private static int[] array;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = "";
		FloorData floorData = new FloorData();
		StackOperation stackOperation = new StackOperation();

		do{
			array = floorData.getDataFromUser();
			stackOperation.buildingSkyscraper(array, array.length);
			System.out.println("\nDo you want to continue if yes press 'y' or press any key to exit");
			string = scanner.next();
		}while(string.equalsIgnoreCase("y"));	
		System.out.println("Exited Successfully");

		if(scanner != null) {
			scanner.close();
		}
	}

}
